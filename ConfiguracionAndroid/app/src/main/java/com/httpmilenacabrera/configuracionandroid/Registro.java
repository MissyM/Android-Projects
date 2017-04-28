package com.httpmilenacabrera.configuracionandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }
    public void goBack(View view){
        Intent intent = new Intent(this,Modelos.class);
        startActivity(intent);
    }
}
