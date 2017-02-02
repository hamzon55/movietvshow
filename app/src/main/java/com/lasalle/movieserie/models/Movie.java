package com.lasalle.movieserie.models;

/**
 * Created by hamza on 25/01/2017.
 */

public class Movie {

    private String name;
    private Integer year;
    private String director;

    public Movie(String name, Integer year, String director) {
        this.name = name;
        this.year = year;
        this.director = director;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


}


