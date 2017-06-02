package com.milenacabrera.sqlitedatabase;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.view.View;
import android.widget.Toast;


import com.milenacabrera.sqlitedatabase.Models.Connection;
import com.milenacabrera.sqlitedatabase.Models.DbHelper;

import static com.milenacabrera.sqlitedatabase.R.styleable.View;

public class MainActivity extends AppCompatActivity {

    EditText editId;
    EditText editNombre;
    EditText editApellido;
    EditText editEdad;

    RadioButton radioButtonC;
    RadioButton radioButtonS;
    RadioButton radioButton1;
    RadioButton radioButton2;
    CheckBox checkbox_ingles;
    CheckBox checkbox_espanol;
    Button btn_reg;
    Connection connection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editId = (EditText)findViewById(R.id.edit_id);
        editNombre = (EditText)findViewById(R.id.edit_nom);
        editApellido = (EditText)findViewById(R.id.edit_apellido);
        editEdad = (EditText)findViewById(R.id.edit_edad);
        radioButtonC = (RadioButton)findViewById(R.id.radio_c);
        radioButtonS = (RadioButton)findViewById(R.id.radio_s);
        radioButton1 = (RadioButton) findViewById(R.id.radio_f);
        radioButton2 = (RadioButton) findViewById(R.id.radio_m);
        checkbox_ingles = (CheckBox)findViewById(R.id.checkbox_ingles);
        checkbox_espanol = (CheckBox)findViewById(R.id.checkbox_espanol);
        btn_reg = (Button)findViewById(R.id.btn_reg);

        //Instanciamos la conexión
        connection = new Connection(getApplicationContext());

        //Cuando el usuario haga click en el boton Registrarse...
        btn_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //...internamente se obtiene lo que introdujo
                String id = editId.getText().toString();
                String nombre = editNombre.getText().toString();
                String apellido = editApellido.getText().toString();
                String edad = editEdad.getText().toString();
                String estadocivil = radioButtonC.isChecked() ? "c" : "s";
                String genero = radioButton1.isChecked() ? "f" : "m";
                String idiomae = checkbox_espanol.isChecked() ? "si" : "no";
                String idiomai = checkbox_ingles.isChecked() ? "si" : "no";
                //Insertamos el registro en la base de datos con la
                connection.insertRegistro(id, nombre, apellido, edad, estadocivil, genero, idiomai, idiomae);
                //Selimpia el formulario de registro  al hacer el registro, para que sea llenado nuevamente
                editId.setText("");
                editNombre.setText("");
                editApellido.setText("");
                editEdad.setText("");
                radioButtonC.setChecked(false);
                radioButtonS.setChecked(true);
                radioButton1.setChecked(false);
                radioButton2.setChecked(true);
                checkbox_ingles.setChecked(false);
                checkbox_espanol.setChecked(false);

                //Se muestra un mensaje que indica que se introdujo a tal persona en el registro
                Toast.makeText(getApplicationContext(), "Se introdujo a " + nombre,Toast.LENGTH_LONG).show();
            }
        });

    }
}
