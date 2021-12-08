package com.testmaker.repository.datajpa;

import com.testmaker.model.Answer;
import com.testmaker.repository.AnswerRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

@Repository
public class AnswerDataJpaRepository implements AnswerRepository {

    private final CrudAnswerRepository repository;

    public AnswerDataJpaRepository(CrudAnswerRepository repository) {
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
    public Collection<Answer> findAllByQuestionId(Long id) {
        return repository.findAnswersByQuestion(id);
    }

    @Override
    public Answer findById(Long id) {
        return repository.findById(id).orElseThrow();
    }
}
