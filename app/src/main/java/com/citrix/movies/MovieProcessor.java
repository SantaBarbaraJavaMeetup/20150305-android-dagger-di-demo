package com.citrix.movies;

import java.util.List;

public interface MovieProcessor {

    List<Movie> getMoviesByTitle(String search);

}
