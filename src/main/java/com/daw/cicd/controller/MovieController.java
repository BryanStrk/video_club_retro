package com.daw.cicd.controller;

import com.daw.cicd.model.Movie;
import com.daw.cicd.repository.MovieRepositoryImpl;

import java.util.List;

public class MovieController {

    private MovieRepositoryImpl movieRepository;

    public MovieController(MovieRepositoryImpl movieRepository){
        this.movieRepository = movieRepository;
    }

    public void createMovieController(Movie movie){
        movieRepository.createMovie(movie);
    }

    public List<Movie> findAllMovies(){
        return movieRepository.findAll();
    }
}