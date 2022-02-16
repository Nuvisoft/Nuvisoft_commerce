package com.nuvissoft.commerce.authorizationserver.model;

import java.util.List;

import lombok.Data;

@Data
public class SimpleUser {

    private String _id;
    private String name;
    private String lastName;
    private String dni;
    private String email;
    private String username;
    private String password;
    private List<Role> roles;

}
