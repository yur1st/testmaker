package com.testmaker.repository;

import com.testmaker.model.Quiz;

import java.util.List;

public interface QuizRepository {

    Quiz save(Quiz quiz);

    void delete(Long id);

    List<Quiz> findAll();

    Quiz findById(Long id);

}
