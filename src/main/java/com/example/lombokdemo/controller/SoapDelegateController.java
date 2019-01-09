package com.example.lombokdemo.controller;


import com.example.lombokdemo.soap.CalculatorDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SoapDelegateController {

    @Autowired
    CalculatorDelegate calculatorDelegate;

    @GetMapping(value = "/add/{x}/{y}")
    public int add(@PathVariable int x,@PathVariable int y){
        return calculatorDelegate.add(x,y);
    }
}
