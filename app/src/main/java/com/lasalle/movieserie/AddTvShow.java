package com.lasalle.movieserie;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.lasalle.movieserie.manager.TvShowManager;
import com.lasalle.movieserie.models.TvShow;

public class AddTvShow extends AppCompatActivity implements View.OnClickListener {


    private Button addtv;
    private EditText serie;
    private EditText season;
    private EditText star;
    private TvShowManager tvShowManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_tv_show);


        serie = (EditText) findViewById(R.id.serie);
        season = (EditText) findViewById(R.id.season);
        star = (EditText) findViewById(R.id.star);
        addtv = (Button) findViewById(R.id.addtv);

        tvShowManager = TvShowManager.getInstance();

        addtv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.addtv: {

                addtv();
                Intent intent = new Intent(getApplicationContext(), ListTvShow.class);
                startActivity(intent);
                break;
            }

        }
    }

    private void addtv() {
        String newSerie = serie.getText().toString();
        String newSeason = season.getText().toString();
        String newStar = star.getText().toString();

        TvShow tv = new TvShow(newSerie,newSeason,newStar);
        tvShowManager.add(tv);

    }

}
