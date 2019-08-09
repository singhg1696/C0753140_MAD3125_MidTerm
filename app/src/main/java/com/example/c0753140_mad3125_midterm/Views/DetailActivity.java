package com.example.c0753140_mad3125_midterm.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.c0753140_mad3125_midterm.Model.FlightRow;
import com.example.c0753140_mad3125_midterm.Model.SpaceXFlight;
import com.example.c0753140_mad3125_midterm.R;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {

    ImageView imageView ;
    SpaceXFlight flight;

    public static ArrayList<SpaceXFlight> staticSpaceXFlightList;
    public static int position;
    private List<FlightRow> flightRowList;
    TextView txtTitle,txtDetail,txtYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent= getIntent();
        getIds();

        position = intent.getIntExtra("Position",0);
        flight = WelcomeActivity.staticSpaceXFlightList.get(position);

        // Mission Name
        txtTitle.setText(flight.getMission_name());
        // Set Missin Detail
        txtDetail.setText(flight.getDetails());
        // Set Year
        txtYear.setText(flight.getLaunch_year());
        String photoUrl = flight.getLinks().getMission_patch_small();
        Glide.with(imageView)
                .load(photoUrl)
                .centerCrop()
                .placeholder(R.drawable.spacex)
                .error(R.drawable.spacex)
                .fallback(R.drawable.spacex)
                .into(imageView);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.mnu_logout:
                Intent mIntent = new Intent(DetailActivity.this, LoginActivity.class);
                startActivity(mIntent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    public void getIds()
    {
        imageView = findViewById(R.id.imageViewDetail);
        txtTitle = findViewById(R.id.txtDetailTitleMission);
        txtDetail = findViewById(R.id.txtDetails);
        txtYear = findViewById(R.id.txtYear);    }
}
