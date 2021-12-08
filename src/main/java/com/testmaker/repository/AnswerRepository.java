package com.testmaker.repository;

import com.testmaker.model.Answer;

import java.util.Collection;

public interface AnswerRepository {

    Answer save(Answer answer);

    void delete(Long id);

    Collection<Answer> findAll();

    Collection<Answer> findAllByQuestionId(Long id);

    Answer findById(Long id);

}
