package com.citrix.daggerdemo;

import com.citrix.movies.InMemoryMovieFinder;
import com.citrix.movies.MovieFinder;
import com.citrix.movies.MovieProcessor;
import com.citrix.movies.SequentialMovieProcessor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(injects = MovieActivity.class)
public class MovieModule {

    @Singleton @Provides MovieProcessor provideMovieProcessor(SequentialMovieProcessor movieProcessor) {
        return movieProcessor;
    }

    @Singleton @Provides MovieFinder provideMovieFinder(InMemoryMovieFinder movieFinder) {
        return movieFinder;
    }

}
