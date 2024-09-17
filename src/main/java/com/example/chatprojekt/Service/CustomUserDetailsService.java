package com.example.chatprojekt.Service;

import com.example.chatprojekt.Model.Client;
import com.example.chatprojekt.Repository.DBController;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.stereotype.Service;

import java.util.Optional;


@Service

public class CustomUserDetailsService implements UserDetailsService
{

    @Autowired
    private DBController dbcontroller;

    @Override
    public UserDetails loadUserByUsername(String clientname) throws UsernameNotFoundException {
        Optional<Client> client = dbcontroller.findClientByClientname(clientname);
        if (client.isPresent()) {
            var userObj = client.get();
            return User.builder()
                    .username(userObj.getClientname())
                    .password(userObj.getPassword())
                    .build();
        } else {
            throw new UsernameNotFoundException("User not found");
        }
    }



}
