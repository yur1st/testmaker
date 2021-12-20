package com.testmaker.repository;

import com.testmaker.model.question.Answer;

import java.util.Collection;

public interface AnswerRepository {

    Answer save(Answer answer);

    void delete(Long id);

    Collection<Answer> findAll();

    Answer findById(Long id);

}
