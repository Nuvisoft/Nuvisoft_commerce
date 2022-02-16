package com.nuvissoft.commerce.serviceusers.data.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "users")
@Data
public class User {

    @Id
    private String id;
    private String name;
    private String lastName;
    private String dni;
    private String email;
    private String username;
    private String password;
    private List<Role> roles;

}
