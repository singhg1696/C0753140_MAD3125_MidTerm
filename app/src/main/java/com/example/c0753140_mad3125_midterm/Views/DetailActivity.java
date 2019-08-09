package com.example.c0753140_mad3125_midterm.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.c0753140_mad3125_midterm.R;

public class DetailActivity extends AppCompatActivity {

    String position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent= getIntent();
        int data = intent.getIntExtra("Position",0);
        Toast.makeText(this, ">>>>>>>>>>"+data, Toast.LENGTH_SHORT).show();
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
