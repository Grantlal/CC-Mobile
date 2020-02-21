package com.example.culinarycompanion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        WebView myWebView = new WebView(this.getApplicationContext());
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        setContentView(myWebView);
        myWebView.loadUrl("https://culinary-companions.herokuapp.com/");
    }
}
