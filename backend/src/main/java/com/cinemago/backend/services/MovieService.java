package com.cinemago.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinemago.backend.entities.Movie;
import com.cinemago.backend.repositories.MovieRepository;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovieById(Long id) {
        return movieRepository.findById(id).orElse(null);
    }

    public List<Movie> searchMovies(String query) {
        return movieRepository.findByTitleContainingIgnoreCase(query);
    }
}
