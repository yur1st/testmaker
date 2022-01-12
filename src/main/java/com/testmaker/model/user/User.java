package com.testmaker.model.user;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.testmaker.model.AbstractBaseEntity;
import com.testmaker.model.proposal.Proposal;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User extends AbstractBaseEntity {

    private String name;

    @Embedded
    private UserStatistic statistic;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private List<UserAuthority> authorities;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private List<Proposal> proposals;

}
