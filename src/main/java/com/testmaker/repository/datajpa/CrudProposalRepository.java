package com.testmaker.repository.datajpa;

import com.testmaker.model.proposal.Proposal;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface CrudProposalRepository extends CrudRepository<Proposal, Long> {

    Collection<Proposal> findAllByUser(Long userId);

    Collection<Proposal> findAllByQuiz(Long quizId);

}
