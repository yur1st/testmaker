package com.testmaker.model.user;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
public class UserStatistic {

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



