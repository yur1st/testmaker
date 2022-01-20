package com.testmaker.repository.datajpa;

import com.testmaker.model.proposal.Proposal;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.persistence.Tuple;
import java.util.Collection;

public interface CrudProposalRepository extends CrudRepository<Proposal, Long> {

    @Query(value = "SELECT proposal.id as proposal_id, question_id, status, quiz_id, q.name as quiz_name, " +
            "user_id, u.name as user_name FROM proposal " +
            "inner join users u on (proposal.user_id = u.id)" +
            "inner join quiz q on (proposal.quiz_id = q.id)" +
            "WHERE proposal.quiz_id = :quiz_id", nativeQuery = true)
    Collection<Tuple> findAllByQuizId(@Param("quiz_id") Long quizId);

}
