package com.daw.cicd.model;

public class Movie {

    private int id;
    private String title;
    private String genre;
    private int anio;
    private String synopsis;
    private String imageUrl;
    private String director;
    private double rating;

    public Movie(String title, String genre, int anio, String synopsis, String imageUrl, String director, double rating) {
        this.title = title;
        this.genre = genre;
        this.anio = anio;
        this.synopsis = synopsis;
        this.imageUrl = imageUrl;
        this.director = director;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getAnio() {
        return anio;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDirector() {
        return director;
    }

    public double getRating() {
        return rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}