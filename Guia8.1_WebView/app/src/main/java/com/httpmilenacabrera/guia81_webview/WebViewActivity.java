package com.httpmilenacabrera.guia81_webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview_alone);

        //Obtenemos lo WebView creados en el Layout
//        WebView webView1 = (WebView)findViewById(R.id.webview1);
        WebView webView2 = (WebView)findViewById(R.id.webview2);

        //Puedo cargar las páginas
//        webView1.loadUrl("http://mercadolibre.com/");

        //Puedo mostrar una página creada en la carpeta assets

        String rutaHtml = "file:///android_asset/index2.html";

        webView2.getSettings().setJavaScriptEnabled(true);
        webView2.setWebChromeClient(new WebChromeClient());
        webView2.loadUrl(rutaHtml);
    }
}
