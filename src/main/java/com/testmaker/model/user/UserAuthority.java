package com.testmaker.model.user;

import com.testmaker.model.AbstractBaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user_authority")
@Data
public class UserAuthority extends AbstractBaseEntity {

    private String name;

}
