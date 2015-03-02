package com.citrix.movies;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class InMemoryMovieFinder implements MovieFinder {

    @Inject
    public InMemoryMovieFinder() {}

    @Override
    public List<Movie> findMovies() {
        String[] titles = {
                "The Grand Budapest Hotel",
                "The Imitation Game",
                "Boyhood",
                "Selma",
                "Whiplash",
                "Birdman",
                "The Theory of Everything"
        };

        List<Movie> movies = new ArrayList<>();
        for(String title : titles) {
            movies.add(new Movie(title));
        }

        return movies;
    }

}
