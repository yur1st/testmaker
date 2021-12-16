package com.testmaker.repository.datajpa.implementation;

import com.testmaker.model.user.UserStatistic;
import com.testmaker.repository.UserStatisticRepository;
import com.testmaker.repository.datajpa.CrudUserStatisticRepository;

import java.util.ArrayList;
import java.util.Collection;

public class UserStatisticRepositoryImpl implements UserStatisticRepository {

    private final CrudUserStatisticRepository repository;

    public UserStatisticRepositoryImpl(CrudUserStatisticRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserStatistic save(UserStatistic statistic) {
        return repository.save(statistic);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Collection<UserStatistic> findAll() {
        Collection<UserStatistic> result = new ArrayList<>();
        repository.findAll().forEach(result::add);
        return result;
    }

    @Override
    public Collection<UserStatistic> findAllOrderingByPropQuestions() {
        return new ArrayList<>(repository.findTop50ByOrderByProposedQuestionsDesc());
    }

    @Override
    public Collection<UserStatistic> findAllOrderedByQuizCompleted() {
        return new ArrayList<>(repository.findTop50ByOrderByQuizzesCompletedDesc());
    }

    @Override
    public Collection<UserStatistic> findAllOrderedByQuizCreated() {
        return new ArrayList<>(repository.findTop50ByOrderByQuizzesCreatedDesc());
    }

    @Override
    public UserStatistic findById(Long id) {
        return repository.findById(id).orElseThrow();
    }
}
