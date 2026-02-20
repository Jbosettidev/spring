package com.joao.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String helloworld(String name){
        return "Hello World! " + name;
    }
}
