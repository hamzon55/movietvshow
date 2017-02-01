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
public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    public static class MovieViewHolder extends RecyclerView.ViewHolder {
        TextView movieName;
        TextView movie_director;
        TextView movie_year;


        public MovieViewHolder(View itemView) {
            super(itemView);
            movieName = (TextView) itemView.findViewById(R.id.movie_name);
            movie_director = (TextView) itemView.findViewById(R.id.movie_director);
            movie_year = (TextView) itemView.findViewById(R.id.movie_year);

        }
    }

    List<Movie> movies;

    MovieAdapter(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);

    }


    @Override
    public MovieAdapter.MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item, parent, false);
        MovieViewHolder fvh = new MovieViewHolder(v);
        return fvh;
    }

    @Override
    public void onBindViewHolder(MovieAdapter.MovieViewHolder holder, int i) {

        holder.movieName.setText(movies.get(i).getName());
        holder.movie_director.setText(movies.get(i).getDirector());
        holder.movie_year.setText(movies.get(i).getYear());

    }





    @Override
    public int getItemCount() {
        return movies.size();
    }
}
