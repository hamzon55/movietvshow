package com.lasalle.movieserie;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.lasalle.movieserie.manager.MovieManager;
import com.lasalle.movieserie.models.Movie;

public class AddMovie extends AppCompatActivity implements View.OnClickListener {

    private Button addmovie;
    private EditText name;
    private EditText year;
    private EditText director;
    private MovieManager movieManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_movie);

        addmovie = (Button) findViewById(R.id.addmovie);
        name = (EditText) findViewById(R.id.name);
        year = (EditText) findViewById(R.id.year);
        director = (EditText) findViewById(R.id.director);
        addmovie.setOnClickListener(this);


        movieManager = new MovieManager();

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.addmovie: {

                addMovie();
                Intent intent = new Intent(getApplicationContext(), ListMovieShow.class);
                startActivity(intent);
                break;
            }

        }
    }

    private void addMovie() {
        String newName = name.getText().toString();
        String newYear = year.getText().toString();
        String newDirector = director.getText().toString();
        Movie movie = new Movie(newName, newYear, newDirector);
        movieManager.add(movie);

    }

}

