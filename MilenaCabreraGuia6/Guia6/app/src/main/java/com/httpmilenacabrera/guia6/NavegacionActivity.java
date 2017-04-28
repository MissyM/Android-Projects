package com.httpmilenacabrera.guia6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NavegacionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegacion);
    }
    public void siguiente(View view){
        Intent intent = new Intent(this,Navegacion2Activity.class);
        startActivity(intent);
    }
}
