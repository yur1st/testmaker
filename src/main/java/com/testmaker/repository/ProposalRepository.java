package com.testmaker.repository;

import com.testmaker.model.proposal.Proposal;

import java.util.Collection;

public interface ProposalRepository {

    Proposal save(Proposal proposal);

    void delete(Long id);

    Collection<Proposal> findAll();

    Proposal findById(Long id);
}
