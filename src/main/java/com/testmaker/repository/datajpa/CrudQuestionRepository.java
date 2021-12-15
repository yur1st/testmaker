package com.testmaker.repository.datajpa;

import com.testmaker.model.question.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface CrudQuestionRepository extends CrudRepository<Question, Long> {

    Collection<Question> findQuestionsByQuiz(Long quizId);

}
