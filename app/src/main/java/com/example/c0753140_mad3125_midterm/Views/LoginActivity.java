package com.example.c0753140_mad3125_midterm.Views;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import com.example.c0753140_mad3125_midterm.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    private EditText editTextEmail,editTextPass;
    private Button btnLogin;
    private FirebaseAuth mAuth;
    private CheckBox rememberMe;
    private SharedPreferences loginPreferences;
    private SharedPreferences.Editor loginPrefsEditor;
    private Boolean saveLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getIds();
        loginPreferences = getSharedPreferences("loginPrefs", MODE_PRIVATE);
        loginPrefsEditor = loginPreferences.edit();

        saveLogin = loginPreferences.getBoolean("saveLogin", false);
        if (saveLogin == true) {
            editTextEmail.setText(loginPreferences.getString("username", ""));
            editTextPass.setText(loginPreferences.getString("password", ""));
            rememberMe.setChecked(true);
        }
        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String emailAddress = editTextEmail.getText().toString().trim();
                if (editTextPass.getText().toString().length() < 6) {
                    editTextPass.setError("password minimum contain 6 character");
                    editTextPass.requestFocus();
                }
                if (editTextPass.getText().toString().equals("")) {
                    editTextPass.setError("please enter password");
                    editTextPass.requestFocus();
                }
                if (!Patterns.EMAIL_ADDRESS.matcher(emailAddress).matches()) {
                    editTextEmail.setError("please enter valid email address");
                    editTextEmail.requestFocus();
                }
                if (editTextEmail.getText().toString().equals("")) {
                    editTextEmail.setError("please enter email address");
                    editTextEmail.requestFocus();
                }
                if (!emailAddress.equals("") &&
                        editTextPass.getText().toString().length() >= 6 &&
                        !editTextPass.getText().toString().trim().equals("")
                        && Patterns.EMAIL_ADDRESS.matcher(emailAddress).matches())

                mAuth.signInWithEmailAndPassword(editTextEmail.getText().toString(), editTextPass.getText().toString())
                        .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {

                                    if (rememberMe.isChecked()) {
                                        loginPrefsEditor.putBoolean("saveLogin", true);
                                        loginPrefsEditor.putString("username", editTextEmail.getText().toString());
                                        loginPrefsEditor.putString("password", editTextPass.getText().toString());
                                        loginPrefsEditor.commit();
                                    } else {
                                        loginPrefsEditor.clear();
                                        loginPrefsEditor.commit();
                                    }

                                    Toast.makeText(LoginActivity.this, "Success", Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(LoginActivity.this, WelcomeActivity.class);
                                    startActivity(intent);
                                    // Sign in success, update UI with the signed-in user's information
                                    //startActivity(new Intent(LoginActivity.this,WelcomeActivity.class));
                                } else {
                                    // If sign in fails, display a message to the user.
                                    Toast.makeText(LoginActivity.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();
                                }

                                // ...
                            }
                        });
            }
        });
    }

    // function to get each id from xml file
    public void getIds()
    {
        editTextEmail = findViewById(R.id.txtEmail);
        editTextPass = findViewById(R.id.txtPass);
        btnLogin = findViewById(R.id.btnLogin);
        rememberMe = findViewById(R.id.chkboxRememberMe);
    }






}
