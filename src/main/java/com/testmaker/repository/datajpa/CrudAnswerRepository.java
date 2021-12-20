package com.testmaker.repository.datajpa;

import com.testmaker.model.question.Answer;
import org.springframework.data.repository.CrudRepository;

public interface CrudAnswerRepository extends CrudRepository<Answer, Long> {


}
