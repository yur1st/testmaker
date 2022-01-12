package com.testmaker.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.testmaker.model.proposal.Proposal;
import com.testmaker.model.question.Question;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity(name = "Quiz")
@Table(name = "quiz")
@Getter
@Setter
public class Quiz extends AbstractBaseEntity {

    private String name;
    private String description;

    @Column(name = "questions_number")
    private int questionsNumber;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private Set<Question> questions;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "quiz_id")
    @JsonManagedReference
    private List<Proposal> proposals;

}
