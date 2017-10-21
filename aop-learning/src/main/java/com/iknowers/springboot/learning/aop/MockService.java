package com.iknowers.springboot.learning.aop;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;

@Service
public class MockService {

    @LogExecutionTime
    public void doThings() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        System.out.println("do things.");
    }

    public void doOtherThings() {
        System.out.println("do other things.");
    }
}
