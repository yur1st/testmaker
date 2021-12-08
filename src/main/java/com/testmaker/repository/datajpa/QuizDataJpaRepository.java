package com.testmaker.repository.datajpa;

import com.testmaker.model.Quiz;
import com.testmaker.repository.QuizRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class QuizDataJpaRepository implements QuizRepository {

    private final CrudQuizRepository quizRepository;

    public QuizDataJpaRepository(CrudQuizRepository quizRepository) {
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
