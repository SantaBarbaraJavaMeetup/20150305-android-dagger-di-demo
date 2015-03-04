package com.citrix.movies;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SequentialMovieProcessorTest extends TestCase {

    public void testProcessor() {
        MovieFinder movieFinder = new MovieFinder() {
            public List<Movie> findMovies() {
                return new ArrayList<>(Arrays.asList(new Movie("Test")));
            }
        };

        SequentialMovieProcessor processor = new SequentialMovieProcessor(movieFinder);
        Assert.assertEquals(0, processor.getMoviesByTitle("x").size());
        Assert.assertEquals(1, processor.getMoviesByTitle("test").size());
    }

}
