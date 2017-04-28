package com.httpmilenacabrera.guas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ViewBasicoActivity extends AppCompatActivity {

    TextView texto;
    EditText nombre, cedula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_basico);
        texto = (TextView)findViewById(R.id.texto);
        nombre = (EditText)findViewById(R.id.nombre);
        cedula = (EditText)findViewById(R.id.cedula);

    }

    public void getNombre(View view){
        texto.setText(nombre.getText().toString());
    }
    public void getCedula(View view){
        texto.setText(cedula.getText().toString());
    }
}
