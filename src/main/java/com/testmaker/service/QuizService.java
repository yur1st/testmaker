package com.testmaker.service;

import com.testmaker.model.Quiz;
import com.testmaker.repository.QuizRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    private final QuizRepository quizRepository;

    public QuizService(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    public List<Quiz> getAll() {
        return quizRepository.findAll();
    }

}
