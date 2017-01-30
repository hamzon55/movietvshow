package com.lasalle.movieserie.data.impl;

import com.lasalle.movieserie.data.TvShowData;
import com.lasalle.movieserie.models.TvShow;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hamza on 29/01/2017.
 */

public class TvShowDataMock implements TvShowData {


    private List<TvShow> tvShowList;


    public TvShowDataMock() {

        tvShowList = new ArrayList<>();
        tvShowList.add(new TvShow("Test 1 ", 4, "Sebas :p"));
        tvShowList.add(new TvShow("Test 2 ", 4, "Sebas :p"));
        tvShowList.add(new TvShow("Test 3", 4, "Sebas :p"));


    }

    @Override
    public List<TvShow> getSeries() {
        return tvShowList;
    }
}
