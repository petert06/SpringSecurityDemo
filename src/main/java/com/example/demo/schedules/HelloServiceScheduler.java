package com.example.demo.schedules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.example.demo.services.HelloService;

@Service
public class HelloServiceScheduler {

    @Autowired
    private HelloService helloService;

    @Scheduled(fixedRate = 20 * 1000, initialDelay = 3000)
    public void runHelloService() {
        helloService.secureMethod();
    }

}
