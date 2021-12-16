package com.testmaker.repository;

import com.testmaker.model.question.Question;

import java.util.Collection;

public interface QuestionRepository {

    Question save(Question question);

    void delete(Long id);

    Collection<Question> findAll();

    Collection<Question> findAllByQuizId(Long id);

    Question findById(Long id);

    int getTotalQuestions(Long quizId);
}
