package com.lasalle.movieserie;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.lasalle.movieserie.manager.TvShowManager;
import com.lasalle.movieserie.models.TvShow;

import java.util.List;

/**
 * Created by hamza on 30/01/2017.
 */

public class ListTvShow extends AppCompatActivity {

    private List<TvShow> tvShowList;
    private RecyclerView rcvt;
    private TvShowManager tvShowManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_tv_show);

        rcvt = (RecyclerView) findViewById(R.id.rcv);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rcvt.setLayoutManager(llm);


        tvShowManager =TvShowManager.getInstance();
        tvShowList = tvShowManager.getSeries();

        initializeAdapter();

    }


    @Override
    protected void onResume() {
        super.onResume();

        tvShowList = tvShowManager.getSeries();
        initializeAdapter();
    }


    private void initializeAdapter() {
        TvShowAdapter adapter = new TvShowAdapter(tvShowList);
        rcvt.setAdapter(adapter);


    }


}

