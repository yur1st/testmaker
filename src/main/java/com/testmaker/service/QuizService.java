package com.testmaker.service;

import com.testmaker.mapping.QuizMapper;
import com.testmaker.model.Quiz;
import com.testmaker.model.dto.QuizAnswersDto;
import com.testmaker.model.dto.QuizDto;
import com.testmaker.model.dto.QuizListDto;
import com.testmaker.model.dto.ResultDto;
import com.testmaker.model.question.Answer;
import com.testmaker.model.question.Question;
import com.testmaker.repository.QuizRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class QuizService {

    private final QuizRepository quizRepository;

    private final QuizMapper mapper;

    public QuizService(QuizRepository quizRepository, QuizMapper mapper) {
        this.quizRepository = quizRepository;
        this.mapper = mapper;
    }

    public Collection<QuizListDto> getAll() {

        return mapper.quizToQuizList(quizRepository.findAll());
    }

    public QuizDto getById(Long quizId) {
        return mapper.quizToQuizDtoIndividual(quizRepository.findById(quizId));
    }


    public QuizDto addQuiz(QuizDto quiz) {
        Quiz result = quizRepository.save(mapper.quizDtoToQuizIndividual(quiz));
        return mapper.quizToQuizDtoIndividual(result);

    }

    public QuizDto updateQuiz(Long quizId, QuizDto quizDto) {
        Quiz quiz = quizRepository.findById(quizId);
        mapper.updateQuizFromQuizDto(quizDto, quiz);
        Quiz result = quizRepository.save(quiz);
        return mapper.quizToQuizDtoIndividual(result);
    }

    public String deleteQuiz(Long quizId) {
        Quiz quiz = quizRepository.findById(quizId);
        quizRepository.delete(quizId);
        return String.format("Quiz №%d: \"%s\" is successfully deleted.", quiz.getId(), quiz.getName());
    }

    public Quiz getQuizWithRightAnswersOnly(Quiz quiz) {
        for (Question question : quiz.getQuestions()) {
            question.setAnswers(question.getAnswers().stream()
                    .filter(Answer::isRight)
                    .collect(Collectors.toSet()));
        }
        return quiz;
    }


    public ResultDto checkAnswers(Long quizId, QuizAnswersDto answers) {
        ResultDto result = new ResultDto(quizRepository.findById(quizId));
        if (quizId.equals(result.getQuiz().getId())) {
            Quiz rightQuiz = getQuizWithRightAnswersOnly(result.getQuiz());
            for (Question question : rightQuiz.getQuestions()) {
                Long id = question.getId();
                Set<Answer> rightAnswers = question.getAnswers();
                Set<Answer> answeredSet = answers.getAnswers().get(id);
                boolean isRight = answeredSet.equals(rightAnswers);
                result.getResults().put(id, isRight);
            }
            return result;
        } else {
            System.out.println("Wrong quizId in path");
        }
        return null;

    }
}
