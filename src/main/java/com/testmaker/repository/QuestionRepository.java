package com.testmaker.repository;

import com.testmaker.model.Question;

import java.util.List;

public interface QuestionRepository {

    Question save(Question question);

    void delete(Long id);

    List<Question> findAll();

    List<Question> findAllByQuizId(Long id);

    Question findById(Long id);

}
