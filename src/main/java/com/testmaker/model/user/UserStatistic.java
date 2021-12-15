package com.testmaker.model.user;

import com.testmaker.model.AbstractBaseEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user_statistic")
@Data
public class UserStatistic extends AbstractBaseEntity {

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private User user;

    private int quizzesCompleted;
    private int totalAnsweredQuestions;
    private int rightAnsweredQuestions;
    private int proposedQuestions;
    private int quizzesCreated;

}
