package com.xworkz.encapsualtion.runner;

import com.xworkz.encapsualtion.things.Movie;

public class MovieRunner {
    public static void main(String[] args) {

        Movie movie=new Movie();
        movie.setMovieName("Thunderbolts");
        movie.setRating(7.5);
        System.out.println("Movie :"+movie.getMovieName());
        System.out.println("Rating :"+movie.getRating());
    }
}
