package com.citrix.movies;

import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

public class SequentialMovieProcessor implements MovieProcessor {

    private final MovieFinder movieFinder;

    @Inject
    public SequentialMovieProcessor(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    @Override
    public List<Movie> getMoviesByTitle(String search) {
        List<Movie> movies = movieFinder.findMovies();
        Iterator<Movie> it = movies.iterator();
        while(it.hasNext()) {
            if(!it.next().titleContains(search)) {
                it.remove();
            }
        }
        return movies;
    }

}
