package com.citrix.daggerdemo;

import com.citrix.movies.MovieProcessor;

import dagger.Module;
import dagger.Provides;

@Module(injects = MovieActivity.class)
public class TestModule {

    @Provides MovieProcessor provideMovieProcessor() {
        return new TestMovieProcessor();
    }

}
