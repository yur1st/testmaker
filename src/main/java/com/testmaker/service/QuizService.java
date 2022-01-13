package com.testmaker.service;

import com.testmaker.mapping.QuizMapper;
import com.testmaker.model.AbstractBaseEntity;
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
import java.util.LinkedHashMap;
import java.util.Map;
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

    public Map<Long, Set<Long>> getQuizWithRightAnswersOnly(Quiz quiz) {
        Map<Long, Set<Long>> result = new LinkedHashMap<>();
        for (Question question : quiz.getQuestions()) {
            result.put(question.getId(), question.getAnswers().stream()
                    .filter(Answer::isRight)
                    .map(AbstractBaseEntity::getId)
                    .collect(Collectors.toSet()));
        }
        return result;
    }


    public ResultDto checkAnswers(Long quizId, QuizAnswersDto answers) {
        Quiz quiz = quizRepository.findById(quizId);
        ResultDto result = new ResultDto(quiz);
        if (quizId.equals(result.getQuiz().getId())) {
            Map<Long, Set<Long>> answersMap = getQuizWithRightAnswersOnly(result.getQuiz());
            for (Map.Entry<Long, Set<Long>> entry : answersMap.entrySet()) {
                Long id = entry.getKey();
                Set<Long> rightAnswers = entry.getValue();
                Set<Long> answeredSet = answers.getAnswers().get(id);
                boolean isRight = answeredSet.size() == rightAnswers.size() && rightAnswers.containsAll(answeredSet);
                result.getResults().put(id, isRight);
            }
            return result;
        } else {
            System.out.println("Wrong quizId in path");
        }
        return null;

    }
}
