package com.example.demo.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "film_actor")
public class FilmActor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "actor_id", nullable = false)
    private Actor actor;

    @ManyToOne
    @JoinColumn(name = "film_id", nullable = false)
    private Film film;

    @Column(name = "last_update")
    private LocalDateTime last_update;

    // Constructors
    public FilmActor() {
    }

    public FilmActor(Actor actor, Film film, LocalDateTime last_update) {
        this.actor = actor;
        this.film = film;
        this.last_update = last_update;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public LocalDateTime getLast_update() {
        return last_update;
    }

    public void setLast_update(LocalDateTime last_update) {
        this.last_update = last_update;
    }

    // toString
    @Override
    public String toString() {
        return "FilmActor{" +
                "id=" + id +
                ", actor=" + actor +
                ", film=" + film +
                ", last_update=" + last_update +
                '}';
    }
}

