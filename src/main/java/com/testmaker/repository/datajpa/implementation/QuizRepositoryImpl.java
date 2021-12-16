package com.testmaker.repository.datajpa.implementation;

import com.testmaker.model.Quiz;
import com.testmaker.repository.QuizRepository;
import com.testmaker.repository.datajpa.CrudQuizRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class QuizRepositoryImpl implements QuizRepository {

    private final CrudQuizRepository quizRepository;

    public QuizRepositoryImpl(CrudQuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    @Override
    public Quiz save(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public void delete(Long id) {
        quizRepository.deleteById(id);
    }

    @Override
    public List<Quiz> findAll() {
        List<Quiz> result = new ArrayList<>();
        quizRepository.findAll().forEach(result::add);
        return result;
    }

    @Override
    public Quiz findById(Long id) {
        return quizRepository.findById(id).orElseThrow();
    }


}
