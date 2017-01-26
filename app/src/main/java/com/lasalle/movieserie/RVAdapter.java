package com.lasalle.movieserie;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lasalle.movieserie.models.Movie;

import java.util.List;

/**
 * Created by hamza on 26/01/2017.
 */
public class RVAdapter extends RecyclerView.Adapter< RVAdapter.MovieViewHolder> {

   public static class MovieViewHolder extends RecyclerView.ViewHolder{
       TextView movieName;

       public MovieViewHolder(View itemView) {
           super(itemView);
         movieName= (TextView)itemView.findViewById(R.id.movie_name);
       }
   }

    List<Movie> movies;
    RVAdapter(List<Movie> movies)
    {
        this.movies = movies;
    }





    @Override
    public RVAdapter.MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list_movie_show ,parent,false);
        MovieViewHolder fvh= new MovieViewHolder(v);
        return  fvh;
    }

    @Override
    public void onBindViewHolder(RVAdapter.MovieViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return movies.size();
    }
}
