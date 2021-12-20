package com.testmaker.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.testmaker.model.proposal.Proposal;
import com.testmaker.model.question.Question;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity(name = "Quiz")
@Table(name = "quiz")
@Data
public class Quiz extends AbstractBaseEntity {

    private String name;
    private String description;

    @Column(name = "questions_number")
    private int questionsNumber;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
            property = "id")
    private Set<Question> questions;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "quiz_id")
    private List<Proposal> proposals;

}
