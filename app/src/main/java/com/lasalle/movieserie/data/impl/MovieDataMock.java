package com.lasalle.movieserie.data.impl;

import com.lasalle.movieserie.data.MovieData;
import com.lasalle.movieserie.models.Movie;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hamza on 26/01/2017.
 */

public class MovieDataMock implements MovieData {

    private List<Movie> movieList;

    public MovieDataMock() {

        movieList = new ArrayList<>();
        movieList.add(new Movie("movie1", "1989", "Director Sebas"));
        movieList.add(new Movie("movie2", "1988", "Director Sebas"));
        movieList.add(new Movie("movie3", "1999", "Director Sebas"));
    }


    @Override
    public Movie getMovie(int movieId) {
        return movieList.get(movieId);
    }

    @Override
    public Integer countMovies() {
        return movieList.size();
    }

    @Override
    public List<Movie> getMovies() {
        return movieList;
    }
}
