package com.example.lombokdemo.service;


import com.example.lombokdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    private  final String BASE_URL = "https://jsonplaceholder.typicode.com/users";
    @Autowired
    RestTemplate restTemplate;

    public List<User> findAllUser(){
        ParameterizedTypeReference<List<User>> typeReference = new ParameterizedTypeReference<List<User>>() {
        };

        ResponseEntity<User[]> result = restTemplate.getForEntity(BASE_URL, User[].class);
        return Arrays.asList(result.getBody());
    }



}
