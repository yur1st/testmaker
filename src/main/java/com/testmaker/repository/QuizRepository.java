package com.testmaker.repository;

import com.testmaker.model.Quiz;

import java.util.Collection;

public interface QuizRepository {

    Quiz save(Quiz quiz);

    void delete(Long id);

    Collection<Quiz> findAll();

    Quiz findById(Long id);

}
