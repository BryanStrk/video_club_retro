package com.daw.cicd;

import com.daw.cicd.controller.MovieController;
import com.daw.cicd.repository.MovieRepositoryImpl;
import com.daw.cicd.view.MovieView;

public class Main {

        static void main(String[] args) {

        MovieRepositoryImpl movieRepository = new MovieRepositoryImpl();
        MovieController movieController = new MovieController(movieRepository);
        MovieView movieView = new MovieView(movieController);

        movieView.createMovieView();
        movieView.showMovies();
    }
}