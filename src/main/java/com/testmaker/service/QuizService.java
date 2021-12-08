package com.testmaker.service;

import com.testmaker.model.Quiz;
import com.testmaker.repository.QuizRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class QuizService {

    private final QuizRepository quizRepository;

    public QuizService(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    public Collection<Quiz> getAll() {
        return quizRepository.findAll();
    }

}
