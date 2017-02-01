package com.lasalle.movieserie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button list;
    private Button add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (Button) findViewById(R.id.list);
        add = (Button) findViewById(R.id.add);
        list.setOnClickListener(this);
        add.setOnClickListener(this);

    }



    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case  R.id.list: {
                Intent intent = new Intent(getApplicationContext(), ListMovieShow.class);
                startActivity(intent);
                break;
            }

            case R.id.add: {
                Intent intent = new Intent(getApplicationContext(),AddMovie.class);
                startActivity(intent);
                break;
            }

        }
    }




}

