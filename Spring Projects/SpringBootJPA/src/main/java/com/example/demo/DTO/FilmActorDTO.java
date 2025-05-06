package com.example.demo.DTO;


import java.time.LocalDateTime;


public class FilmActorDTO {


    private Long actorId;

    
    private Long filmId;

    private LocalDateTime lastUpdate;

    // Getters and Setters
    public Long getActorId() {
        return actorId;
    }

    public void setActorId(Long actorId) {
        this.actorId = actorId;
    }

    public Long getFilmId() {
        return filmId;
    }

    public void setFilmId(Long filmId) {
        this.filmId = filmId;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}

