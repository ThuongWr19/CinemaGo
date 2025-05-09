package com.cinemago.backend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

enum STATUS {
    COMMING_SOON,
    NOW_SHOWING,
    STOPPED
}

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(name = "release_date")
    private java.time.LocalDateTime releaseDate;

    @Enumerated(EnumType.ORDINAL)
    private MovieStatus status;

    @Column(length = 255)
    private String title;

    @Column(name = "poster_url")
    private String posterUrl;

    @Column(name = "trailer_url")
    private String trailerUrl;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public java.time.LocalDateTime getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(java.time.LocalDateTime releaseDate) {
        this.releaseDate = releaseDate;
    }

    public MovieStatus getStatus() {
        return status;
    }

    public void setStatus(MovieStatus status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public String getTrailerUrl() {
        return trailerUrl;
    }

    public void setTrailerUrl(String trailerUrl) {
        this.trailerUrl = trailerUrl;
    }
}

enum MovieStatus {
    DRAFT(0), PUBLISHED(1), ARCHIVED(2), UNRELEASED(3);

    private final int value;

    MovieStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}