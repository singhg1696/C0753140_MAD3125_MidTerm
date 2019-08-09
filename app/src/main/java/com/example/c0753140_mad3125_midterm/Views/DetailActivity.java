package com.example.c0753140_mad3125_midterm.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.example.c0753140_mad3125_midterm.Model.SpaceXFlight;
import com.example.c0753140_mad3125_midterm.R;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    ImageView imageView ;
    public static ArrayList<SpaceXFlight> staticSpaceXFlightList;
    public static int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent= getIntent();
        imageView = findViewById(R.id.imageViewDetail);
        position = intent.getIntExtra("Position",0);
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
}
