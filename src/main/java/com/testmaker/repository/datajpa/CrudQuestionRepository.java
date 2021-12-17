package com.testmaker.repository.datajpa;

import com.testmaker.model.question.Question;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface CrudQuestionRepository extends CrudRepository<Question, Long> {

    Collection<Question> findQuestionsByQuiz(Long quizId);

    @Query(value = "select count(*) from question q where q.quiz_id = ?1", nativeQuery = true)
    int countAllByQuizId(Long quizId);

}
