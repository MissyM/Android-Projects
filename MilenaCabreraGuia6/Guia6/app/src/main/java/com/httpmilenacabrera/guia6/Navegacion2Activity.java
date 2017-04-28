package com.httpmilenacabrera.guia6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Navegacion2Activity extends AppCompatActivity {

    Button inicio,colores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegacion2);
        inicio = (Button) findViewById(R.id.inicio);
        colores = (Button) findViewById(R.id.colores);

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent intent = new Intent(Navegacion2Activity.this,NavegacionActivity.class);
            startActivity(intent);
            }
        });

        colores.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view) {
               Intent intent = new Intent(Navegacion2Activity.this,Navegacion3Activity.class);
               startActivity(intent);
           }
        });
    }
}
