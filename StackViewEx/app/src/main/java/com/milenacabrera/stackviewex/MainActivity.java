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
    List<StackItemPictures> listaItems;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stackView = (StackView) findViewById(R.id.stkImagenes);

        cargarPeliculas();

        cargarItems();

        AdapterStack adapter = new AdapterStack(this,R.layout.item,listaItems);

        stackView.setAdapter(adapter);

        stackView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Pelicula p = peliculas.get(position);

                intent = new Intent(MainActivity.this, PeliculaActivity.class);
                intent.putExtra("nom", p.getNombre());
                intent.putExtra("img", p.getImg());
                intent.putExtra("sinop", p.getSinapsis());
                intent.putExtra("prot", p.getReparto());
                intent.putExtra("direc", p.getDirector());
                startActivity(intent);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void cargarPeliculas(){
        peliculas = new LinkedList<>();
        peliculas.add(new Pelicula("Civil War",R.drawable.f1, "Sinanpsis", "reparto", "Director"));
        peliculas.add(new Pelicula("Deadpool",R.drawable.f2, "Sinanpsis", "reparto", "Director"));
        peliculas.add(new Pelicula("Buscando A Dori",R.drawable.f3, "Sinanpsis", "reparto", "Director"));
        peliculas.add(new Pelicula("Doctor Strange",R.drawable.f4, "Sinanpsis", "reparto", "Director"));
    }

    public void cargarItems()
    {
        listaItems = new LinkedList<>();

        for(Pelicula p : peliculas) {
            listaItems.add(new StackItemPictures(p.getNombre(), p.getImg()));
        }
    }
}
