package com.example.demo.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import com.example.demo.DTO.LoginRequest;

@Aspect
@Component
public class SecurityLoggingAspect {

    @Before("execution(* com.example.demo.controllers..*(..))")
    public void logSecurityAccess(JoinPoint joinPoint) {
        System.out.println("[SECURITY LOG] User '" +
            org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication().getName() +
            "' is attempting to access: " +
            joinPoint.getSignature()
        );
    }

    @AfterReturning("execution(@org.springframework.security.access.prepost.PreAuthorize * *(..)) || execution(@org.springframework.security.access.prepost.PostAuthorize * *(..))")
    public void logAfterSecuredMethods(JoinPoint joinPoint) {
        System.out.println(" [SECURITY LOG] Access granted to: " + joinPoint.getSignature());
    }

    @AfterThrowing(pointcut = "execution(@org.springframework.security.access.prepost.PreAuthorize * *(..)) || execution(@org.springframework.security.access.prepost.PostAuthorize * *(..))", throwing = "ex")
    public void logAccessDenied(JoinPoint joinPoint, Throwable ex) {
        System.out.println(" [SECURITY LOG] Access denied for method: " + joinPoint.getSignature());
        System.out.println("❗ Exception: " + ex.getMessage());
    }
    
    @Before("execution(* com.example.demo.controllers.AuthController.login(..))")
    public void logLoginAttempt(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            if (arg instanceof LoginRequest loginRequest) {
                System.out.println("[SECURITY LOG] Login attempt by username: " + loginRequest.getUsername());
            }
        }
    }
}

