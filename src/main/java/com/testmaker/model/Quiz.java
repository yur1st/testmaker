package com.testmaker.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Quiz")
@Table(name = "quiz")
public class Quiz extends AbstractBaseEntity {

    private String name;
    private String description;
    private int questionsNumber;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "quiz_id")
    private List<Question> questions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuestionsNumber() {
        return questionsNumber;
    }

    public void setQuestionsNumber(int questionsNumber) {
        this.questionsNumber = questionsNumber;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
