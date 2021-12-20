package com.testmaker.repository.datajpa;

import com.testmaker.model.proposal.Proposal;
import org.springframework.data.repository.CrudRepository;

public interface CrudProposalRepository extends CrudRepository<Proposal, Long> {

}
