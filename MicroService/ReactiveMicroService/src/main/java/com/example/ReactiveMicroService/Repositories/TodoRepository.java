package com.example.ReactiveMicroService.Repositories;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.example.ReactiveMicroService.Entities.Todo;

public interface TodoRepository extends ReactiveCrudRepository<Todo, Long> {
}

