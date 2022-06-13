package com.nuvissoft.commerce.authorizationserver.services;

import java.util.Set;
import java.util.stream.Collectors;

import com.nuvissoft.commerce.authorizationserver.client.FeignClientService;
import com.nuvissoft.commerce.authorizationserver.model.SimpleUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    FeignClientService client;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SimpleUser user = client.finByUsername(username);

        if (user.equals(null)) {
            throw new UsernameNotFoundException(
                    new StringBuilder("User \"")
                            .append(username)
                            .append("\"")
                            .append(" was not found :(")
                            .toString());
        }

        Set<GrantedAuthority> authorities = user.getRoles()
                .stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toSet());

        return new User(
                user.getUsername(),
                user.getPassword(),
                true,
                true,
                true,
                true,
                authorities);

    }

}
