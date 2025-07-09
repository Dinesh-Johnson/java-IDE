package com.xworkz.encapsualtion.things;

public class Movie {
    private String movieName;
    private double rating;


    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public String getMovieName() {
        return movieName;
    }
    public double getRating() {
        return rating;
    }
    public boolean hit() {
        return rating > 7.0;
    }
}
