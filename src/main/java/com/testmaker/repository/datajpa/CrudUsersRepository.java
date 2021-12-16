package com.testmaker.repository.datajpa;

import com.testmaker.model.user.User;
import org.springframework.data.repository.CrudRepository;

public interface CrudUsersRepository extends CrudRepository<User, Long> {
}
