package com.example.lombokdemo;


import com.example.lombokdemo.confg.SoapDelegateConfig;
import com.example.lombokdemo.soap.CalculatorDelegate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
//@SpringBootTest(classes = LombokDemoApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(locations = {"classpath:application.properties"})
@ContextConfiguration(classes = {SoapDelegateConfig.class})
public class CalculatorDeleteTest {

    @Autowired
    CalculatorDelegate calculatorDelegate;

    @Test
    public void testAdd(){
        int add = calculatorDelegate.add(2, 5);
        assertEquals(7,add) ;
    }
}
