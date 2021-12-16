package com.testmaker.service;

import com.testmaker.mapping.QuizMapper;
import com.testmaker.model.Quiz;
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

    public Quiz getById(Long quizId) {
        return quizRepository.findById(quizId);
    }


}
