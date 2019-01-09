package com.example.lombokdemo.controller;

import com.example.lombokdemo.LombokDemoApplication;
import com.example.lombokdemo.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LombokDemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerTest {

    private  final String BASE_URL = "/users";

    @Autowired
    TestRestTemplate restTemplate;

    @Test
    public void getUserTest(){

        ResponseEntity<List> result  = restTemplate.getForEntity(BASE_URL, List.class);

        List<User> users = result.getBody();

        System.out.println(users);

        assertTrue(result.getBody().size() > 0);

    }

}
