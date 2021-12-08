package com.testmaker.repository.datajpa;

import com.testmaker.model.Answer;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface CrudAnswerRepository extends CrudRepository<Answer, Long> {

    Collection<Answer> findAnswersByQuestion(Long questionId);
}
