package com.testmaker.repository.datajpa.implementation;

import com.testmaker.model.proposal.Proposal;
import com.testmaker.repository.ProposalRepository;
import com.testmaker.repository.datajpa.CrudProposalRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

@Repository
public class ProposalRepositoryImpl implements ProposalRepository {

    private final CrudProposalRepository repository;

    public ProposalRepositoryImpl(CrudProposalRepository repository) {
        this.repository = repository;
    }

    @Override
    public Proposal save(Proposal proposal) {
        return repository.save(proposal);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Collection<Proposal> findAll() {
        Collection<Proposal> result = new ArrayList<>();
        repository.findAll().forEach(result::add);
        return result;
    }

    @Override
    public Proposal findById(Long id) {
        return repository.findById(id).orElseThrow();
    }
}
