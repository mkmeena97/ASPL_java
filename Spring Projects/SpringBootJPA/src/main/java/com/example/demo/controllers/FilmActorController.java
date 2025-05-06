package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.example.demo.DTO.FilmActorDTO;
import com.example.demo.services.FilmActorService;

import java.util.List;

@RestController
@RequestMapping("/api/film-actors")
public class FilmActorController {

    @Autowired
    private FilmActorService filmActorService;

    @GetMapping
    public ResponseEntity<List<FilmActorDTO>> getAllFilmActors() {
        return filmActorService.getAllFilmActors();
    }

    // GET by ID
    @GetMapping("/{id}")
    public ResponseEntity<FilmActorDTO> getFilmActorById(@PathVariable Long id) {
        return filmActorService.getFilmActorById(id);
    }

    // POST
    @PostMapping
    public ResponseEntity<FilmActorDTO> createFilmActor(@Validated @RequestBody FilmActorDTO dto) {
        return filmActorService.createFilmActor(dto);
    }

    // PUT
    @PutMapping("/{id}")
    public ResponseEntity<FilmActorDTO> updateFilmActor(@PathVariable Long id, @Validated @RequestBody FilmActorDTO dto) {
        return filmActorService.updateFilmActor(id, dto);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFilmActor(@PathVariable Long id) {
        return filmActorService.deleteFilmActor(id);
    }
}