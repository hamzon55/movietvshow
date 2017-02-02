package com.lasalle.movieserie.models;

/**
 * Created by hamza on 28/01/2017.
 */

public class TvShow {

    private String serie;
    private String seasons;
    private String star;

    public TvShow(String serie, String seasons, String star) {
        this.serie = serie;
        this.seasons = seasons;
        this.star = star;
    }



    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getSeasons() {
        return seasons;
    }

    public void setSeasons(String seasons) {
        this.seasons = seasons;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }











}
