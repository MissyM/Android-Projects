package com.httpmilenacabrera.actividadcontrolesdeseleccion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    ListView listview; //declaración del ListView
    ArrayAdapter<String> adaptador;//Declaración del array adapter
    String [] lenguajes={
            "JavaScript",
            "C",
            "Python",
            "PHP",
            "Java",
            "Ruby"};//Creación del array

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = (ListView) findViewById(R.id.lenguajesprogramacion);//Referencia a la lista de lenguajes de programación
        adaptador= new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,lenguajes);//Inicializo el adaptador
        listview.setAdapter(adaptador); //Vinculo la lista con el array

        //Implementación del método onItemClickListener
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                // Creación del Toast para mostrar el contrnido del item de la lista cuando se da click utilizando getItemAtPosition
                Toast.makeText(MainActivity.this, " Seleccionó " + parent.getItemAtPosition(position)+id,Toast.LENGTH_SHORT).show();
               Intent intent = new Intent(MainActivity.this, FeaturesActivity.class);
                intent.putExtra("lenguaje", lenguajes[(int)id]);
                startActivity(intent);
            }
        });

    }
}
