package com.httpmilenacabrera.controlesseleccionapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class AdapterListViewActivity extends AppCompatActivity {

    ListView listview; //declaración del ListView
    ArrayAdapter<String> adaptador;//Declaración del array adapter
    String [] ciudades={
            "POPAYAN",
            "CALI",
            "MEDELLIN",
            "BOGOTÁ",
            "CARTAGENA",
            "SANTA MARTA",
            "CARTAGENA",
            "BUENAVENTURA",
            "CARTAGO",
            "FLORENCIA",
            "PEREIRA",
            "MANIZALEZ"};//Creación del array


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_list_view);
        listview = (ListView) findViewById(R.id.listview);//Referenciación del ListWiew
        adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ciudades);//Inicialización del adaptador
        listview.setAdapter(adaptador);//Vinculación del listView con el adapter

        //IMPLEMENTACIÓN DEL MÉTODO OnItemClickListener
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override

            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
        // Creación del Toast para mostrar el contrnido del item de la lista cuando se da click utilizando getItemAtPosition
                Toast.makeText(AdapterListViewActivity.this, " Seleccionó " + parent.getItemAtPosition(position)+id+position,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
