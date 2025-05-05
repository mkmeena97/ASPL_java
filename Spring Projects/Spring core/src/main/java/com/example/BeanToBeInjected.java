package com.example;


import org.springframework.stereotype.Component;

@Component
public class BeanToBeInjected {
    public void sayHello() {
        System.out.println("Injected Dependency: BeanToBeInjected!");
    }
}

