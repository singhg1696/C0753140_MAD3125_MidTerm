package com.example.c0753140_mad3125_midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText editTextEmail,editTextPass;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getIds();
    }

    private void getIds(){
        editTextEmail = findViewById(R.id.txtEmail);
        editTextPass = findViewById(R.id.txtPass);
        btnLogin = findViewById(R.id.btnLogin);
    }
}
