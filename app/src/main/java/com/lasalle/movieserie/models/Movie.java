package com.lasalle.movieserie.models;

/**
 * Created by hamza on 25/01/2017.
 */

public class Movie {

    private String name;
    private String year;
    private String director;

    public Movie(String name, String year, String director) {
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


}


