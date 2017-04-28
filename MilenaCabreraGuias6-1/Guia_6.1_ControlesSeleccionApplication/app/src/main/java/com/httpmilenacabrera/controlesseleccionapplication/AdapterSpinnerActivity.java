package com.httpmilenacabrera.controlesseleccionapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import static com.httpmilenacabrera.controlesseleccionapplication.R.id.listview;

public class AdapterSpinnerActivity extends AppCompatActivity {
    Spinner spinner; //declaración del ListView
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
        setContentView(R.layout.activity_adapter_spinner);
        spinner = (Spinner) findViewById(R.id.spinner);//Referenciación del Spinner
        adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,ciudades);//Inicialización del adaptador
        spinner.setAdapter(adaptador);//Vinculación del listView con el adapter

        //IMPLEMENTACIÓN DEL MÉTODO OnItemClickListener
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
                // Creación del Toast para mostrar el contrnido del item de la lista cuando se da click utilizando getItemAtPosition
                Toast.makeText(AdapterSpinnerActivity.this, " Seleccionó " + parent.getItemAtPosition(position)+id+position,Toast.LENGTH_SHORT).show();
            }
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
