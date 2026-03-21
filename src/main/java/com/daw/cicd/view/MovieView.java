package com.daw.cicd.view;

import com.daw.cicd.controller.MovieController;
import com.daw.cicd.model.Movie;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MovieView {

    private MovieController movieController;

    public MovieView(MovieController movieController){
        this.movieController = movieController;
    }

    public void createMovieView(){
        Movie movie = generateMovie();
        movieController.createMovieController(movie);
    }

    public Movie generateMovie(){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Escriba el título de la película: ");
        String title = scanner.nextLine();

        System.out.println("Escriba el género de la película: ");
        String genre = scanner.nextLine();

        System.out.println("Escriba el año de la película: ");
        int anio = Integer.parseInt(scanner.nextLine());

        System.out.println("Escriba la sinopsis de la película: ");
        String synopsis = scanner.nextLine();

        System.out.println("Escriba la URL de la imagen: ");
        String imageUrl = scanner.nextLine();

        System.out.println("Escriba el director de la película: ");
        String director = scanner.nextLine();

        System.out.println("Escriba la valoración de la película: ");
        double rating = Double.parseDouble(scanner.nextLine());

        Movie movie = new Movie(title, genre, anio, synopsis, imageUrl, director, rating);

        return movie;
    }

    public void showMovies(){
        List<Movie> movieList = movieController.findAllMovies();

        for (Movie movie : movieList){
            System.out.println("Título: " + movie.getTitle()
                    + " | Género: " + movie.getGenre()
                    + " | Año: " + movie.getAnio()
                    + " | Director: " + movie.getDirector()
                    + " | Rating: " + movie.getRating());
        }
    }
}