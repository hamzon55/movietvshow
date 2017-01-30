package com.lasalle.movieserie;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lasalle.movieserie.models.TvShow;

import java.util.List;

/**
 * Created by hamza on 30/01/2017.
 */

public class TvShowAdapter extends RecyclerView.Adapter<TvShowAdapter.TvShowViewHolder> {


    public  static class  TvShowViewHolder extends RecyclerView.ViewHolder{
        TextView TvName;
        TextView TvSeasons;
        TextView TvStar;


        public TvShowViewHolder(View itemView) {
            super(itemView);
            TvName =(TextView) itemView.findViewById(R.id.tvshowname);
            TvSeasons =(TextView) itemView.findViewById(R.id.seasons);
            TvStar =(TextView) itemView.findViewById(R.id.star);

        }
    }

    List<TvShow> tvShowList;

    TvShowAdapter(List<TvShow> tvShowList){

        this.tvShowList = tvShowList;
    }


    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);

    }
    @Override
    public TvShowAdapter.TvShowViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_tv_item, parent, false);
        TvShowViewHolder tvh = new TvShowViewHolder(v);
        return tvh;
    }

    @Override
    public void onBindViewHolder(TvShowAdapter.TvShowViewHolder holder, int i) {
        holder.TvName.setText(tvShowList.get(i).getSerie());
        holder.TvSeasons.setText(tvShowList.get(i).getSeasons().toString());
        holder.TvStar.setText(tvShowList.get(i).getStar());



    }

    @Override
    public int getItemCount() {
        return tvShowList.size();
    }
}
