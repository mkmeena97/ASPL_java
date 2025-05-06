package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.FilmActorDTO;
import com.example.demo.entities.FilmActor;
import com.example.demo.repositories.ActorRepository;
import com.example.demo.repositories.FilmActorRepository;
import com.example.demo.repositories.FilmRepository;

import java.util.List;
import java.util.Optional;


import java.time.LocalDateTime;
import java.util.stream.Collectors;

@Service
public class FilmActorService {

    @Autowired
    private FilmActorRepository filmActorRepository;

    @Autowired
    private FilmRepository filmRepository;

    @Autowired
    private ActorRepository actorRepository;


    public ResponseEntity<List<FilmActorDTO>> getAllFilmActors() {
        List<FilmActorDTO> dtos = filmActorRepository.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
        return ResponseEntity.ok(dtos);
    }

    public ResponseEntity<FilmActorDTO> getFilmActorById(Long id) {
        Optional<FilmActor> filmActor = filmActorRepository.findById(id);
        return filmActor.map(actor -> ResponseEntity.ok(convertToDTO(actor)))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    public ResponseEntity<FilmActorDTO> createFilmActor(FilmActorDTO dto) {
        FilmActor entity = convertToEntity(dto);
        entity.setLast_update(LocalDateTime.now());
        FilmActor saved = filmActorRepository.save(entity);
        return ResponseEntity.ok(convertToDTO(saved));
    }

    public ResponseEntity<FilmActorDTO> updateFilmActor(Long id, FilmActorDTO dto) {
        Optional<FilmActor> existing = filmActorRepository.findById(id);
        if (existing.isPresent()) {
            FilmActor filmActor = existing.get();
            filmActor.setActor(actorRepository.findById(dto.getActorId()).orElse(null));
            filmActor.setFilm(filmRepository.findById(dto.getFilmId()).orElse(null));
            filmActor.setLast_update(dto.getLastUpdate() != null ? dto.getLastUpdate() : LocalDateTime.now());
            FilmActor updated = filmActorRepository.save(filmActor);
            return ResponseEntity.ok(convertToDTO(updated));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Void> deleteFilmActor(Long id) {
        if (filmActorRepository.existsById(id)) {
            filmActorRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    private FilmActorDTO convertToDTO(FilmActor entity) {
        FilmActorDTO dto = new FilmActorDTO();
        dto.setActorId(entity.getActor().getActor_id());
        dto.setFilmId(entity.getFilm().getFilm_id());
        dto.setLastUpdate(entity.getLast_update());
        return dto;
    }

    private FilmActor convertToEntity(FilmActorDTO dto) {
        FilmActor entity = new FilmActor();
        entity.setActor(actorRepository.findById(dto.getActorId()).orElse(null));
        entity.setFilm(filmRepository.findById(dto.getFilmId()).orElse(null));
        entity.setLast_update(dto.getLastUpdate());
        return entity;
    }
}
