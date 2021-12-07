package com.testmaker.repository.datajpa;

import com.testmaker.model.Quiz;
import com.testmaker.repository.QuizRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QuizDataJpaRepository implements QuizRepository {
    @Override
    public Quiz save(Quiz quiz) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Quiz> findAll() {
        return null;
    }

    @Override
    public Quiz findById(Long id) {
        return null;
    }
}
