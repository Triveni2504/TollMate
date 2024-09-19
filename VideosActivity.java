package com.darkness.WSafety;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class VideosActivity extends AppCompatActivity {

    WebView webView;
    WebView webView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);

        webView = findViewById(R.id.webView);
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://youtu.be/alRWA7VJauk?si=QbALEB6-1PrAkhTR");


        webView2 = findViewById(R.id.webView2);
        webView2.setWebChromeClient(new WebChromeClient());
        webView2.getSettings().setLoadsImagesAutomatically(true);
        webView2.getSettings().setJavaScriptEnabled(true);
        webView2.loadUrl("https://youtube.com/shorts/Cwc5YIEboHU?si=klwub72Vmx83e3g_");

    }
}
