package com.testmaker.repository.datajpa;

import com.testmaker.model.Quiz;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudQuizRepository extends CrudRepository<Quiz, Long> {
}
