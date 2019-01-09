package com.example.lombokdemo;


import com.example.lombokdemo.controller.SoapDelegateController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LombokDemoApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SoapDelegateControllerTest {
    @Autowired
    SoapDelegateController controller;

    @Autowired
    TestRestTemplate restTemplate;

    @Test
    public void testAddControllerJava(){
        assertEquals(7,controller.add(2,5));
    }

    @Test
    public void testAddEndPoint(){
        ResponseEntity<Integer> result = restTemplate.getForEntity("/add/3/5", Integer.class);
        assertEquals((Integer) 8,result.getBody());
    }
}
