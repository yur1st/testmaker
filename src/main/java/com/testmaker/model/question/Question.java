package com.testmaker.model.question;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.testmaker.model.AbstractBaseEntity;
import com.testmaker.model.Quiz;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "Question")
@Table(name = "question")
@Getter
@Setter
public class Question extends AbstractBaseEntity {

    private String body;

    @Enumerated(value = EnumType.STRING)
    private QuestionType type;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "question_id")
    @JsonManagedReference
    private Set<Answer> answers;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    private Quiz quiz;

}
