package com.testmaker.repository.datajpa.implementation;

import com.testmaker.model.question.Question;
import com.testmaker.repository.QuestionRepository;
import com.testmaker.repository.datajpa.CrudQuestionRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

@Repository
public class QuestionRepositoryImpl implements QuestionRepository {

    private final CrudQuestionRepository repository;

    public QuestionRepositoryImpl(CrudQuestionRepository repository) {
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

    @Override
    public int getTotalQuestions(Long quizId) {
        return repository.countAllByQuiz(quizId);
    }

}
