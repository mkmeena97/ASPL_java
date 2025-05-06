package com.example.demo.controllers;

import com.example.demo.entities.Film;
import com.example.demo.services.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/films")
public class FilmController {

    @Autowired
    private FilmService filmService;

//    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/getallfilms")
    public List<Film> getAllFilms() {
        return filmService.getAllFilms();
    }

//    @PostAuthorize("returnObject.body.username == authentication.name or hasRole('ADMIN')")
    @GetMapping("/{id}")
    public ResponseEntity<Film> getFilmById(@PathVariable Long id) {
        return filmService.getFilmById(id);
    }

    @PostMapping("/addfilm")
    public ResponseEntity<Film> createFilm(@RequestBody Film film) {
        return filmService.createFilm(film);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Film> updateFilm(@PathVariable Long id, @RequestBody Film film) {
        return filmService.updateFilm(id, film);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteFilm(@PathVariable Long id) {
        return filmService.deleteFilm(id);
    }
}

