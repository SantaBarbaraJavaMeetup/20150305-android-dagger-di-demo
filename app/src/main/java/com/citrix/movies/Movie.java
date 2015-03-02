package com.citrix.movies;

public class Movie {

    private final String title;

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }

    public boolean titleContains(String text) {
        return title.toLowerCase().contains(text.toLowerCase());
    }

}
