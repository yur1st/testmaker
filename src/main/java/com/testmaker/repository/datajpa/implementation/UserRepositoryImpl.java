package com.testmaker.repository.datajpa.implementation;

import com.testmaker.model.user.User;
import com.testmaker.repository.UserRepository;
import com.testmaker.repository.datajpa.CrudUsersRepository;

import java.util.ArrayList;
import java.util.Collection;

public class UserRepositoryImpl implements UserRepository {

    private final CrudUsersRepository repository;

    public UserRepositoryImpl(CrudUsersRepository repository) {
        this.repository = repository;
    }

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Collection<User> findAll() {
        Collection<User> result = new ArrayList<>();
        repository.findAll().forEach(result::add);
        return result;
    }

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElseThrow();
    }
}
