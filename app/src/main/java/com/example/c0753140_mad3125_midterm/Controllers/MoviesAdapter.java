package com.example.c0753140_mad3125_midterm.Controllers;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.c0753140_mad3125_midterm.Model.FlightRow;
import com.example.c0753140_mad3125_midterm.R;
import com.example.c0753140_mad3125_midterm.Views.WelcomeActivity;

import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {

    public List<FlightRow> flightRowsList;
    ImageView flightImage;
    private onMovieListener onMovieListener;
    TextView flightName,flightYear;

    private static final String TAG = "FlightAdapter";

    AppCompatActivity activity;

    public MoviesAdapter(AppCompatActivity activity_main, List<FlightRow> flightRowsList,onMovieListener onMovieListener)
    {
        this.flightRowsList = flightRowsList;
        this.onMovieListener = onMovieListener;
        this.activity = activity_main;
        Log.e(TAG, "FlightAdapter: "+flightRowsList.size() );

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.movie_list, viewGroup, false);

        return new MyViewHolder(itemView,onMovieListener);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        FlightRow mFlightRow = flightRowsList.get(i);
        String photoUrl = WelcomeActivity.staticSpaceXFlightList.get(i).getLinks().getMission_patch_small();
        Glide.with(myViewHolder.flightImage)
                .load(photoUrl)
                .centerCrop()
                .placeholder(R.drawable.spacex)
                .error(R.drawable.spacex)
                .fallback(R.drawable.spacex)
                .into(myViewHolder.flightImage);
                myViewHolder.flightName.setText(mFlightRow.getFlightName());
        myViewHolder.flightYear.setText(mFlightRow.getFlightYear());
    }

    @Override
    public int getItemCount() {
        return flightRowsList.size();
    }




    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        ImageView flightImage;
        TextView flightName,flightYear;
        onMovieListener onMovieListener;

        public MyViewHolder(View view,onMovieListener onMovieListener)
        {
            super(view);
            this.onMovieListener = onMovieListener;
            flightImage =  view.findViewById(R.id.image);
            flightName =  view.findViewById(R.id.title);
            flightYear =  view.findViewById(R.id.year);

            // Click Listener Attached to Holder Class
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {

            onMovieListener.onNoteClick(getAdapterPosition());

        }
    }

    public interface onMovieListener{
        void onNoteClick(int position);
    }
}
