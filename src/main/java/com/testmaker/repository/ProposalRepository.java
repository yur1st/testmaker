package com.testmaker.repository;

import com.testmaker.model.proposal.Proposal;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

public interface ProposalRepository {

    Proposal save(Proposal proposal);

    void delete(Long id);

    Collection<Proposal> findAll();

    Proposal findById(Long id);

    @Query(value = "SELECT proposal.id, status, question_id, quiz_id, q.name, user_id, u.name FROM proposal" +
            "inner join users u on proposal.user_id = u.id" +
            "inner join quiz q on proposal.quiz_id = q.id" +
            "WHERE proposal.quiz_id = ?1")
    Collection<Proposal> findAllByQuizId(Long quizId);
}
