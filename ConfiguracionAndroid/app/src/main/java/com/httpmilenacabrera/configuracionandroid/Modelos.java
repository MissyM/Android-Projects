package com.httpmilenacabrera.configuracionandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Modelos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modelos);
    }
    public void goForward(View view){
        Intent intent = new Intent(this,Registro.class);
        startActivity(intent);
    }

    public void goBack(View view){
        Intent intent = new Intent(this,Jugadores.class);
        startActivity(intent);
    }
    public void goContacts(View view){
        Intent intent = new Intent(this,Registro.class);
        startActivity(intent);
    }
}
