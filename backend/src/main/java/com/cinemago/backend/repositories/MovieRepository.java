package com.cinemago.backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinemago.backend.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByTitleContainingIgnoreCase(String title);
}
