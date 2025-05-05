package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    private final MyService myService;
    private final MyRepository myRepository;

    @Autowired
    public MyComponent(MyService myService, MyRepository myRepository) {
        this.myService = myService;
        this.myRepository = myRepository;
    }

    public void showMessage() {
        System.out.println(myService.getMessage());
        System.out.println(myRepository.getData());
    }
}

