package com.testmaker.model.question;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.testmaker.model.AbstractBaseEntity;
import com.testmaker.model.Quiz;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "Question")
@Table(name = "question")
@Data
public class Question extends AbstractBaseEntity {

    private String body;

    @Enumerated(value = EnumType.STRING)
    private QuestionType type;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private Set<Answer> answers;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    private Quiz quiz;

}
