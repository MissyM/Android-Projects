package com.httpmilenacabrera.listviewadaptativos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.httpmilenacabrera.listviewadaptativos.model.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class ListViewPeliculas extends AppCompatActivity {

    ListView listView;
    List<Pelicula> listapeliculas;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listviewpeliculas);

        listView = (ListView) findViewById(R.id.list);
        fillList();//Llamamos al método.

        adapter = new Adapter(this,listapeliculas);

        listView.setAdapter(adapter);

    }
    public void fillList(){
        listapeliculas = new ArrayList<>(); // Inicializo el array

        listapeliculas.add(new Pelicula("Kunfu Panda 1","jum",R.mipmap.ic_launcher,1));
        listapeliculas.add(new Pelicula("Kunfu Panda 2","jum",R.mipmap.ic_launcher,2));
        listapeliculas.add(new Pelicula("Kunfu Panda 3","jum",R.mipmap.ic_launcher,3));
        listapeliculas.add(new Pelicula("Kunfu Panda 4","jum",R.mipmap.ic_launcher,4));
        listapeliculas.add(new Pelicula("Kunfu Panda 5","jum",R.mipmap.ic_launcher,5));
        listapeliculas.add(new Pelicula("Kunfu Panda 6","jum",R.mipmap.ic_launcher,6));
    }
}
