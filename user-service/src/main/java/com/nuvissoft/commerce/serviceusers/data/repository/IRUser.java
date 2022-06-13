package com.nuvissoft.commerce.serviceusers.data.repository;

import com.nuvissoft.commerce.serviceusers.data.domain.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface IRUser extends MongoRepository<User, String> {

    public User findByDni(String dni);
    public User findByUsername(String username);
}
