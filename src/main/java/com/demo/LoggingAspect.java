package com.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.demo.ShoppingCart.checkOut(..))")
    public void beforeLlogger(JoinPoint jp) {
        //System.out.println(jp.getSignature());
        System.out.println("argument : -- " + jp.getArgs()[0].toString());
        System.out.println("before Loggers.....");
    }

    @After("execution (* *.*.*.checkOut(..))")
    public void afterLogger() {
        System.out.println("after logger....");
    }

    @Pointcut("execution(* com.demo.ShoppingCart.quantity(..))")
    public void afterReturningPointCutting() {
    }

    @AfterReturning(pointcut = "afterReturningPointCutting()", returning = "retVal")
    public void afterReturning(String retVal) {
        System.out.println("public void after returning....");
    }
}
