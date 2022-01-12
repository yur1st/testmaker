package com.testmaker.model.user;

import com.testmaker.model.AbstractBaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user_authority")
@Getter
@Setter
public class UserAuthority extends AbstractBaseEntity {

    private String name;

}
