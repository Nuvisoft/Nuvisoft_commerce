package com.nuvissoft.commerce.serviceusers.services;

import java.util.List;

import com.nuvissoft.commerce.serviceusers.data.domain.User;

public interface IUserDataOperations {

    public List<User> readAll();

    public User save(User toAdd);
    
}
