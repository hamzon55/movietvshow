package com.lasalle.movieserie.manager;

import com.lasalle.movieserie.data.MovieData;
import com.lasalle.movieserie.data.impl.MovieDataMock;
import com.lasalle.movieserie.models.Movie;

import java.util.List;

/**
 * Created by hamza on 26/01/2017.
 */

public class MovieManager {

    private static MovieManager instance = null;
    private MovieData movieData;


    protected MovieManager() {
        movieData = new MovieDataMock();
    }

    public static MovieManager getInstance() {
        if (instance == null) {
            instance = new MovieManager();
        }
        return instance;
    }


    public Movie getNextMovie() {
        return movieData.getMovie(0);
    }

    public Integer countMovies() {
        return movieData.countMovies();
    }

    public List<Movie> getMovies() {
        return movieData.getMovies();
    }


    public void add(Movie movie) {
        movieData.add(movie);
    }
}






