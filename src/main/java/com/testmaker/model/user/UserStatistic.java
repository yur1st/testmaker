package com.testmaker.model.user;

import com.testmaker.model.AbstractBaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user_statistic")
@Data
public class UserStatistic extends AbstractBaseEntity {

    private int quizzesCompleted;
    private int totalAnsweredQuestions;
    private int rightAnsweredQuestions;
    private int proposedQuestions;
    private int quizzesCreated;

}
