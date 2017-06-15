package com.milenacabrera.sugarapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.milenacabrera.sugarapplication.Model.Datos;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btnSave, btnListar;
    EditText EdTname, EdTlastname, EdTaddress, EdTphone;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSave = (Button)findViewById(R.id.btn_save);
        btnListar = (Button)findViewById(R.id.btn_show);
        EdTname = (EditText) findViewById(R.id.editT_name);
        EdTlastname = (EditText) findViewById(R.id.editT_lastname);
        EdTphone = (EditText) findViewById(R.id.editT_phone);
        EdTaddress = (EditText) findViewById(R.id.editT_address);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Datos datos = new Datos(EdTname.getText().toString(), EdTlastname.getText().toString(), EdTaddress.getText().toString(), EdTphone.getText().toString());
                datos.save();
                EdTname.setText("");
                EdTlastname.setText("");
                EdTaddress.setText("");
                EdTphone.setText("");
                Toast.makeText(getApplicationContext(), "Se guardo el usuario " + datos.getName(), Toast.LENGTH_LONG).show();
            }
        });

        btnListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Datos> DatosLista = Datos.find(Datos.class,"name = ?", EdTname.getText().toString());
                if (DatosLista.size() > 0) {
                    Datos datos = DatosLista.get(0);
                    EdTlastname.setText(datos.getLastname());
                    EdTaddress.setText(datos.getAddress());
                    EdTphone.setText(datos.getPhone());
                } else {
                    Toast.makeText(getApplicationContext(), "No se encontro usuario con nombre: " + EdTname.getText().toString(), Toast.LENGTH_LONG).show();
                }

            }
        });
    }

}
