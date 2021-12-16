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

    @Column(name = "quizzes_completed")
    private int quizzesCompleted;

    @Column(name = "total_answered_questions")
    private int totalAnsweredQuestions;

    @Column(name = "right_answered_questions")
    private int rightAnsweredQuestions;

    @Column(name = "proposed_questions")
    private int proposedQuestions;

    @Column(name = "quizzes_created")
    private int quizzesCreated;

}
