package com.doku.fcwebapibe.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Value("${spring.security.user.name}")
    private String username;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        if(username.equals(username)) {
            return new User(username, "$2a$10$oozUyRXRP4bMj72TfwGUde5aDsRtfcV8JxE5oI.fI89U9wcnooZQi", new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User with username : '" + username + "' not found");
        }
    }
}
