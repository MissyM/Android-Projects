package com.httpmilenacabrera.controlesseleccionapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;


public class AdapterAutocompleteActivity extends AppCompatActivity {
    AutoCompleteTextView autocomplete;
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
    ArrayAdapter<String> adaptador;//Declaración del array adapter

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_autocomplete);
        autocomplete = (AutoCompleteTextView)findViewById(R.id.autocomplete);//Referencio el autocomplete
        autocomplete.setAdapter(adaptador);//Agrego al autocomplete el array que contiene los datos

        adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, ciudades);
        autocomplete.setAdapter(adaptador);
    }
}
