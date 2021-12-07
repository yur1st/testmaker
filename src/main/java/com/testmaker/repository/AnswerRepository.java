package com.testmaker.repository;

import com.testmaker.model.Answer;

import java.util.List;

public interface AnswerRepository {

    Answer save(Answer answer);

    void delete(Long id);

    List<Answer> findAll();

    List<Answer> findAllByQuestionId(Long id);

    Answer findById(Long id);

}
