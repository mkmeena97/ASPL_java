package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.FilmActor;

@Repository
public interface FilmActorRepository extends JpaRepository<FilmActor, Long> {
}

