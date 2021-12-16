package com.testmaker.repository;

import com.testmaker.model.user.User;

import java.util.Collection;

public interface UserRepository {

    User save(User user);

    void delete(Long id);

    Collection<User> findAll();

    User findById(Long id);
}
