package com.testmaker.repository.datajpa;

import com.testmaker.model.user.UserStatistic;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface CrudUserStatisticRepository extends CrudRepository<UserStatistic, Long> {

    Collection<UserStatistic> findTop50ByOrderByProposedQuestionsDesc();

    Collection<UserStatistic> findTop50ByOrderByQuizzesCompletedDesc();

    Collection<UserStatistic> findTop50ByOrderByQuizzesCreatedDesc();

}
