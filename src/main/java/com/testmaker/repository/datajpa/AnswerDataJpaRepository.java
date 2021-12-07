package com.testmaker.repository.datajpa;

import com.testmaker.model.Answer;
import com.testmaker.repository.AnswerRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AnswerDataJpaRepository implements AnswerRepository {
    @Override
    public Answer save(Answer answer) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Answer> findAll() {
        return null;
    }

    @Override
    public List<Answer> findAllByQuestionId(Long id) {
        return null;
    }

    @Override
    public Answer findById(Long id) {
        return null;
    }
}
