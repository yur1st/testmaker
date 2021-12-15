package com.testmaker.model.user;

import com.testmaker.model.AbstractBaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "users")
@Data
public class User extends AbstractBaseEntity {

    private String name;

    @OneToOne
    private UserStatistic statistic;

    @OneToMany
    private List<UserAuthority> authorities;

}
