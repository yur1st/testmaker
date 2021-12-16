package com.testmaker.model;

import com.testmaker.model.proposal.Proposal;
import com.testmaker.model.question.Question;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Quiz")
@Table(name = "quiz")
@Data
public class Quiz extends AbstractBaseEntity {

    private String name;
    private String description;

    @Column(name = "questions_number")
    private int questionsNumber;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Question> questions;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Proposal> proposals;


}
