package com.testmaker.repository.datajpa;

import com.testmaker.model.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudQuestionRepository extends CrudRepository<Question, Long> {
}
