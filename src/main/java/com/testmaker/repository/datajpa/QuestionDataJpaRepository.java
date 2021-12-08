package com.testmaker.repository.datajpa;

import com.testmaker.model.Question;
import com.testmaker.repository.QuestionRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

@Repository
public class QuestionDataJpaRepository implements QuestionRepository {

    private final CrudQuestionRepository repository;

    public QuestionDataJpaRepository(CrudQuestionRepository repository) {
        this.repository = repository;
    }

    @Override
    public Question save(Question question) {

        return repository.save(question);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Collection<Question> findAll() {
        Collection<Question> result = new ArrayList<>();
        repository.findAll().forEach(result::add);
        return result;
    }

    @Override
    public Collection<Question> findAllByQuizId(Long id) {

        return repository.findQuestionsByQuiz(id);
    }

    @Override
    public Question findById(Long id) {

        return repository.findById(id).orElseThrow();
    }

}
