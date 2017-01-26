package com.lasalle.movieserie.data;

import com.lasalle.movieserie.models.Movie;

/**
 * Created by hamza on 26/01/2017.
 */

public interface MovieData {

    public Movie getMovie (int movieId);
    public Integer countMovies();

}

