package com.lasalle.movieserie.manager;

import com.lasalle.movieserie.data.TvShowData;
import com.lasalle.movieserie.data.impl.TvShowDataMock;
import com.lasalle.movieserie.models.TvShow;

import java.util.List;

/**
 * Created by hamza on 30/01/2017.
 */

public class TvShowManager {

    private TvShowData tvShowData;

    public TvShowManager() {
        tvShowData = new TvShowDataMock();
    }


    public List<TvShow> getSeries() {
        return tvShowData.getSeries()
                ;
    }


}
