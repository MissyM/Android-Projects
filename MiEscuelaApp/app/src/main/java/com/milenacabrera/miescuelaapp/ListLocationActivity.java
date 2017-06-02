package com.milenacabrera.miescuelaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.milenacabrera.miescuelaapp.Model.Connection;
import com.milenacabrera.miescuelaapp.Model.LocationModel;

import java.util.ArrayList;

public class ListLocationActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<LocationModel>  listLocations;
    AdapterListLocation adapter;
    Connection connection;//Instancio la conección
    Button btn_delet_all;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_location);
        connection = new Connection(getApplicationContext());
        listView = (ListView) findViewById(R.id.list_loc);
        btn_delet_all = (Button)findViewById(R.id.btn_delete_all);

        listLocations = connection.getLocations();//Trae las posiciones de la base de datos


        adapter = new AdapterListLocation(this,listLocations);//Creo el adaptador y le pasamos el modelo al adaptador

        listView.setAdapter(adapter);//Muestre-renderise la lista*/Le digo al adapter que llene la lista

        btn_delet_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                connection.deletAllLocations();// Eliminamos todas las ubicaiones de la BD
                listLocations.clear();// Vaciamos a lista
                adapter.notifyDataSetChanged();// Le noticamos al adaptado que cambio su lista
            }
        });
    }
}
