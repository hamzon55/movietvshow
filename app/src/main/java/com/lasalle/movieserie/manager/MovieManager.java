package com.lasalle.movieserie.manager;

import com.lasalle.movieserie.data.MovieData;
import com.lasalle.movieserie.data.impl.MovieDataMock;
import com.lasalle.movieserie.models.Movie;

/**
 * Created by hamza on 26/01/2017.
 */

public class MovieManager {

    private MovieData movieData;

    public  MovieManager(){
        movieData = new MovieDataMock();
    }


    public Movie getNextMovie() {
        return movieData.getMovie(0);
    }

    public Integer countMovies() {
        return movieData.countMovies();
    }

}






