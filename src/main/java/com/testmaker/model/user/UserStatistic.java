package com.testmaker.model.user;

import lombok.Data;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class UserStatistic {

    @AttributeOverride(name = "quizzesCompleted", column = @Column(name = "quizzes_completed"))
    private int quizzesCompleted;

    @AttributeOverride(name = "totalAnsweredQuestions", column = @Column(name = "total_answered_questions"))
    private int totalAnsweredQuestions;

    @AttributeOverride(name = "rightAnsweredQuestions", column = @Column(name = "right_answered_questions"))
    private int rightAnsweredQuestions;

    @AttributeOverride(name = "proposedQuestions", column = @Column(name = "proposed_questions"))
    private int proposedQuestions;

    @AttributeOverride(name = "quizzesCreated", column = @Column(name = "quizzes_created"))
    private int quizzesCreated;

}



