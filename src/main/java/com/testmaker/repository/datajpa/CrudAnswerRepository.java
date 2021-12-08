package com.testmaker.repository.datajpa;

import com.testmaker.model.Answer;
import org.springframework.data.repository.CrudRepository;

public interface CrudAnswerRepository extends CrudRepository<Answer, Long> {
}
