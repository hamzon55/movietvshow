package com.lasalle.movieserie;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.lasalle.movieserie.manager.MovieManager;
import com.lasalle.movieserie.models.Movie;

import java.util.List;

public class ListMovieShow extends AppCompatActivity {

    private List<Movie> movies;
    private RecyclerView rv;
    private MovieManager movieManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_movie_show);

        rv = (RecyclerView) findViewById(R.id.rv);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);


        movieManager = new MovieManager();
        movies = movieManager.getMovies();

        initializeAdapter();

    }


    @Override
    protected void onResume() {
        super.onResume();

        movies=movieManager.getMovies();
        initializeAdapter();
    }


    private void initializeAdapter() {
        MovieAdapter adapter = new MovieAdapter(movies);
        rv.setAdapter(adapter);


    }


}

