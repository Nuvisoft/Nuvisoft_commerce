package com.nuvissoft.commerce.serviceusers.services;

import java.util.List;

import com.nuvissoft.commerce.serviceusers.data.domain.User;
import com.nuvissoft.commerce.serviceusers.data.repository.IRUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserDataOperations {

    @Autowired
    private IRUser repository;

    @Override
    public List<User> readAll() {
        return repository.findAll();
    }

    @Override
    public User save(User toAdd) {
        return repository.save(toAdd);
    }

    @Override
    public User findByUsername(String username) {
        return repository.findByUsername(username);
    }

    

}
