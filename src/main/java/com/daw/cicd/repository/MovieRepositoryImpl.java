package com.daw.cicd.repository;

import com.daw.cicd.config.DBManager;
import com.daw.cicd.model.Movie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MovieRepositoryImpl {

    private Connection connection;

    public void createMovie(Movie movie) {

        String querySQLCreate = "INSERT INTO movies(title, genre, anio, synopsis, image_url, director, rating) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            connection = DBManager.initConnection();

            PreparedStatement statement = connection.prepareStatement(querySQLCreate);
            statement.setString(1, movie.getTitle());
            statement.setString(2, movie.getGenre());
            statement.setInt(3, movie.getAnio());
            statement.setString(4, movie.getSynopsis());
            statement.setString(5, movie.getImageUrl());
            statement.setString(6, movie.getDirector());
            statement.setDouble(7, movie.getRating());
            statement.execute();

            System.out.println("Película creada");

        } catch (Exception exception) {
            System.out.println(exception.getMessage());

        } finally {
            DBManager.closeConnection();
        }
    }

    public List<Movie> findAll() {
        List<Movie> movies = new ArrayList<>();
        String querySQLFindAll = "SELECT * FROM movies";

        try {
            connection = DBManager.initConnection();
            PreparedStatement statement = connection.prepareStatement(querySQLFindAll);
            ResultSet response = statement.executeQuery();

            while (response.next()) {
                int id = response.getInt("id");
                String title = response.getString("title");
                String genre = response.getString("genre");
                int anio = response.getInt("anio");
                String synopsis = response.getString("synopsis");
                String imageUrl = response.getString("image_url");
                String director = response.getString("director");
                double rating = response.getDouble("rating");

                Movie movie = new Movie(title, genre, anio, synopsis, imageUrl, director, rating);
                movie.setId(id);

                movies.add(movie);
            }

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            DBManager.closeConnection();
        }

        return movies;
    }
}