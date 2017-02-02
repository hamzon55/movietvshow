package com.lasalle.movieserie.manager;

import com.lasalle.movieserie.data.TvShowData;
import com.lasalle.movieserie.data.impl.TvShowDataMock;
import com.lasalle.movieserie.models.TvShow;

import java.util.List;

/**
 * Created by hamza on 30/01/2017.
 */

public class TvShowManager {
    private static TvShowManager instance = null;
    private TvShowData tvShowData;


    protected TvShowManager() {
        tvShowData = new TvShowDataMock();
    }

    public static TvShowManager getInstance() {
        if (instance == null) {
            instance = new TvShowManager();
        }
        return instance;
    }


    public List<TvShow> getSeries() {
        return tvShowData.getSeries()
                ;
    }


    public void add(TvShow tv) {
        tvShowData.add(tv);
    }
}
