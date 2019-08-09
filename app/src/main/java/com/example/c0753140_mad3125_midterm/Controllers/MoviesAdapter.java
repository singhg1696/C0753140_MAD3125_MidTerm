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
    TextView flightName,flightYear;

    private static final String TAG = "FlightAdapter";

    AppCompatActivity activity;

    public MoviesAdapter(AppCompatActivity activity_main, List<FlightRow> flightRowsList)
    {
        this.flightRowsList = flightRowsList;
        this.activity = activity_main;
        Log.e(TAG, "FlightAdapter: "+flightRowsList.size() );

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.movie_list, viewGroup, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        FlightRow mFlightRow = flightRowsList.get(i);
        String photoUrl = WelcomeActivity.staticSpaceXFlightList.get(i).getLinks().getMission_patch_small();
        Glide.with(myViewHolder.flightImage)  //2
                .load(photoUrl) //3
                .centerCrop() //4
                .placeholder(R.drawable.spacex) //5
                .error(R.drawable.spacex) //6
                .fallback(R.drawable.spacex) //7
                .into(myViewHolder.flightImage);
        //myViewHolder.flightImage.setImageResource(mFlightRow.getImageId());
        //icon.setImageResource(context.getResources().getIdentifier(animal.getAnimalName().toLowerCase(),"drawable",context.getPackageName()));
        myViewHolder.flightName.setText(mFlightRow.getFlightName());
        myViewHolder.flightYear.setText(mFlightRow.getFlightYear());
    }

    @Override
    public int getItemCount() {
        return flightRowsList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        ImageView flightImage;
        TextView flightName,flightYear;

        public MyViewHolder(View view)
        {
            super(view);
            flightImage =  view.findViewById(R.id.image);
            flightName =  view.findViewById(R.id.title);
            flightYear =  view.findViewById(R.id.year);

            // Click Listener Attached to Holder Class
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

        }
    }

    public interface onMovieListener{
        void onNoteClick(int position);
    }
}
