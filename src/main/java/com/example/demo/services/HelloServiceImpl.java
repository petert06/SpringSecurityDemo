package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public void secureMethod() {
        System.out.println("secureMethod called");
    }
}
