package com.testmaker.repository.datajpa;

import com.testmaker.model.Question;
import com.testmaker.repository.QuestionRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QuestionDataJpaRepository implements QuestionRepository {

    @Override
    public Question save(Question question) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Question> findAll() {
        return null;
    }

    @Override
    public List<Question> findAllByQuizId(Long id) {
        return null;
    }

    @Override
    public Question findById(Long id) {
        return null;
    }

}
