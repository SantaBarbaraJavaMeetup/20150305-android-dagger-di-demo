package com.citrix.daggerdemo;

import com.citrix.movies.Movie;
import com.citrix.movies.MovieProcessor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMovieProcessor implements MovieProcessor {

    @Override
    public List<Movie> getMoviesByTitle(String search) {
        return new ArrayList<>(Arrays.asList(new Movie(search)));
    }

}
