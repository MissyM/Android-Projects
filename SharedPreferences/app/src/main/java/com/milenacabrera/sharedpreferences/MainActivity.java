package com.milenacabrera.sharedpreferences;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            //Obtenemos lo WebView creados en el Layout
            WebView webviewLogin = (WebView)findViewById(R.id.webviewLogin);

            //Puedo cargar las páginas
//        webView1.loadUrl("http://mercadolibre.com/");

            //Puedo mostrar una página creada en la carpeta assets

            String rutaHtml = "file:///android_asset/index2.html";

            webviewLogin.getSettings().setJavaScriptEnabled(true);
            webviewLogin.setWebChromeClient(new WebChromeClient());
            webviewLogin.loadUrl(rutaHtml);
        }
    }
