package com.testmaker.service;

import com.testmaker.mapping.QuizMapper;
import com.testmaker.model.Quiz;
import com.testmaker.model.dto.QuizDto;
import com.testmaker.model.dto.QuizListDto;
import com.testmaker.repository.QuizRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

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
        String result = String.format("Quiz №%d: \"%s\" is succesfully deleted.", quiz.getId(), quiz.getName());
        return result;
    }
}
