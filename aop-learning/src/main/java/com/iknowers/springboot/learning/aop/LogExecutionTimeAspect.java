package com.iknowers.springboot.learning.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogExecutionTimeAspect {

    @Around("@annotation(LogExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object result =  joinPoint.proceed();

        System.out.println(joinPoint.getSignature() + " executed in " + (System.currentTimeMillis() - start) + "ms");

        return result;
    }
}
