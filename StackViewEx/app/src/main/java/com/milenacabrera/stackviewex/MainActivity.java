package com.milenacabrera.stackviewex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.StackView;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    StackView stackView;
    List<Pelicula> peliculas;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stackView = (StackView) findViewById(R.id.stkImagenes);

        cargarPeliculas();

        AdapterStack adapter = new AdapterStack(this,R.layout.item,peliculas);

        stackView.setAdapter(adapter);


    }

    public void cargarPeliculas(){
        peliculas = new LinkedList<>();
        peliculas.add(new Pelicula(R.string.civil_war,R.drawable.f1, R.string.civil_war_sinapsis, R.string.civil_war_reparto,R.string.civil_war_director));
        peliculas.add(new Pelicula(R.string.deadpool,R.drawable.f2, R.string.deadpool_sinapsis, R.string.deadpool_reparto,R.string.deadpool_director));
        peliculas.add(new Pelicula(R.string.buscando_a_dori,R.drawable.f3, R.string.buscando_a_dori_sinapsis, R.string.buscando_a_dori_reparto, R.string.buscando_a_dori_director));
        peliculas.add(new Pelicula(R.string.doctor_strange,R.drawable.f4, R.string.doctor_strange_sinapsis, R.string.doctor_strange_reparto, R.string.doctor_strange_director));
    }


}
