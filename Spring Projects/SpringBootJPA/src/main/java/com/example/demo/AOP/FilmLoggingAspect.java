package com.example.demo.AOP;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class FilmLoggingAspect {

    @Pointcut("execution(* com.example.demo.controllers.FilmController.*(..))")
    public void filmControllerMethods() {}

    @Before("filmControllerMethods()")
    public void logBefore(JoinPoint joinPoint) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = (auth != null && auth.isAuthenticated()) ? auth.getName() : "anonymous";

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String methodName = signature.getMethod().getName();

        System.out.println("[FILM LOG] User: '" + username + "' is accessing method: " + methodName);
        System.out.println("[FILM LOG] Arguments: " + Arrays.toString(joinPoint.getArgs()));
    }

    @AfterReturning(pointcut = "filmControllerMethods()", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String methodName = signature.getMethod().getName();

        System.out.println("[FILM LOG] Method: " + methodName + " returned successfully.");
        System.out.println("[FILM LOG] Return value: " + result);
    }

    @AfterThrowing(pointcut = "filmControllerMethods()", throwing = "ex")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable ex) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String methodName = signature.getMethod().getName();

        System.err.println("[FILM LOG] Exception in method: " + methodName);
        System.err.println("[FILM LOG] Exception message: " + ex.getMessage());
    }
}

