package com.remake.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class NewsActivity extends AppCompatActivity {

    WebView webView;

    public void webInit(){
        webView=(WebView)findViewById(R.id.webView);

        WebViewClient client = new WebViewClient();
        webView.setWebViewClient(client);
        webView.getSettings().setJavaScriptEnabled(true);
        Intent intent=getIntent();
        //Intent intent1=getIntent();
        Log.i("intent", String.valueOf(intent));
        //Log.i("intent1", String.valueOf(intent1));
        String url=intent.getStringExtra("keyUrl");
        String url1=intent.getStringExtra("KeyZeeNews");
        String url2=intent.getStringExtra("keyABPLive");
        String url3=intent.getStringExtra("keyCNN");
        String url4=intent.getStringExtra("keyNDTV");
        String url5=intent.getStringExtra("keyIndiaToday");
        String url6=intent.getStringExtra("keyMh1");
        String url7=intent.getStringExtra("keyIndiaExpress");
        String url8=intent.getStringExtra("keyABPSanjha");
        String url9=intent.getStringExtra("keyptc");
        String url10=intent.getStringExtra("keyZeePunjabi");
        String url11=intent.getStringExtra("keyDD");
        String url12=intent.getStringExtra("keyIndiaTV");
        String url13=intent.getStringExtra("keyEconomic");


        webView.loadUrl(url);
        webView.loadUrl(url1);
        webView.loadUrl(url2);
        webView.loadUrl(url3);
        webView.loadUrl(url4);
        webView.loadUrl(url5);
        webView.loadUrl(url6);
        webView.loadUrl(url7);
        webView.loadUrl(url8);
        webView.loadUrl(url9);
        webView.loadUrl(url10);
        webView.loadUrl(url11);
        webView.loadUrl(url12);
        webView.loadUrl(url13);



    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        webInit();



    }
}
