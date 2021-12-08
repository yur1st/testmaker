package com.testmaker.repository.datajpa;

import com.testmaker.model.Quiz;
import com.testmaker.repository.QuizRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class QuizDataJpaRepository implements QuizRepository {

    private final CrudQuizRepository repository;

    public QuizDataJpaRepository(CrudQuizRepository repository) {
        this.repository = repository;
    }

    @Override
    public Quiz save(Quiz quiz) {
        return repository.save(quiz);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Quiz> findAll() {
        List<Quiz> result = new ArrayList<>();
        repository.findAll().forEach(result::add);
        return result;
    }

    @Override
    public Quiz findById(Long id) {
        return repository.findById(id).get();
    }
}
