package com.lasalle.movieserie.data;

import com.lasalle.movieserie.models.TvShow;

import java.util.List;

/**
 * Created by hamza on 29/01/2017.
 */

public interface TvShowData {

    List<TvShow> getSeries();

    void add(TvShow tv);
}
