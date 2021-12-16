package com.testmaker.repository;

import com.testmaker.model.user.UserStatistic;

import java.util.Collection;

public interface UserStatisticRepository {

    UserStatistic save(UserStatistic statistic);

    void delete(Long id);

    Collection<UserStatistic> findAll();

    Collection<UserStatistic> findAllOrderingByPropQuestions();

    Collection<UserStatistic> findAllOrderedByQuizCompleted();

    Collection<UserStatistic> findAllOrderedByQuizCreated();

    UserStatistic findById(Long id);

}
