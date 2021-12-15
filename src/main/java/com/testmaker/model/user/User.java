package com.testmaker.model.user;

import com.testmaker.model.AbstractBaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
@Data
public class User extends AbstractBaseEntity {

    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    private UserStatistic statistic;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "user_id")
    private List<UserAuthority> authorities;

}
