package com.testmaker.repository.datajpa.implementation;

import com.testmaker.model.question.Answer;
import com.testmaker.repository.AnswerRepository;
import com.testmaker.repository.datajpa.CrudAnswerRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

@Repository
public class AnswerRepositoryImpl implements AnswerRepository {

    private final CrudAnswerRepository repository;

    public AnswerRepositoryImpl(CrudAnswerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Answer save(Answer answer) {

        return repository.save(answer);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);

    }

    @Override
    public Collection<Answer> findAll() {
        Collection<Answer> result = new ArrayList<>();
        repository.findAll().forEach(result::add);
        return result;
    }

    @Override
    public Answer findById(Long id) {
        return repository.findById(id).orElseThrow();
    }
}
