package com.example;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
    public String getData() {
        return "Fetching Data from Repository";
    }
}

