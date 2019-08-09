package com.example.c0753140_mad3125_midterm.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;

import com.example.c0753140_mad3125_midterm.R;

public class WebView extends AppCompatActivity {

    android.webkit.WebView idWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        idWebView = findViewById(R.id.idWebView);

        String link = getIntent().getStringExtra("link");

        idWebView.getSettings().setJavaScriptEnabled(true);
        idWebView.getSettings().setLoadsImagesAutomatically(true);
        idWebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        idWebView.setWebViewClient(new WebViewClient());
        idWebView.loadUrl(link);
        WebSettings webSettings = idWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
