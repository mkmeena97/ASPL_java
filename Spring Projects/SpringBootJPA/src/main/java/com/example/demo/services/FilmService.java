package com.example.demo.services;

import com.example.demo.entities.Film;
import com.example.demo.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmService {

    @Autowired
    private FilmRepository filmRepository;

    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }

    public ResponseEntity<Film> getFilmById(Long id) {
        Optional<Film> film = filmRepository.findById(id);
        return film.map(ResponseEntity::ok)
                   .orElseGet(() -> ResponseEntity.notFound().build());
    }

    public ResponseEntity<Film> createFilm(Film film) {
        Film savedFilm = filmRepository.save(film);
        return ResponseEntity.ok(savedFilm);
    }

    public ResponseEntity<Film> updateFilm(Long id, Film updatedFilm) {
        return filmRepository.findById(id).map(film -> {
            film.setTitle(updatedFilm.getTitle());
            film.setDescription(updatedFilm.getDescription());
            film.setRelease_year(updatedFilm.getRelease_year());
            film.setLanguage(updatedFilm.getLanguage());
            film.setRating(updatedFilm.getRating());
            Film savedFilm = filmRepository.save(film);
            return ResponseEntity.ok(savedFilm);
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    public ResponseEntity<?> deleteFilm(Long id) {
        return filmRepository.findById(id).map(film -> {
            filmRepository.delete(film);
            return ResponseEntity.noContent().build();
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }
}

