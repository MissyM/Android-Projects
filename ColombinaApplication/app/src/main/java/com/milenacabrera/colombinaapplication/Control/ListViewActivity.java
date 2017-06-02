package com.milenacabrera.colombinaapplication.Control;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.milenacabrera.colombinaapplication.Model.Connection;
import com.milenacabrera.colombinaapplication.R;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Producto> listProductos;
    AdaptadorList adapter;
    Connection connection;//Instancio la conección
    Button btn_delet_all;
    Button btn_show_new;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        connection = new Connection(getApplicationContext());
        listView = (ListView) findViewById(R.id.listView);
        btn_delet_all = (Button)findViewById(R.id.btn_delete_all);
        btn_show_new = (Button)findViewById(R.id.btn_show_new);

        listProductos = connection.getProducts();//Trae las posiciones de la base de datos


        adapter = new AdaptadorList(this, listProductos);//Creo el adaptador y le pasamos el modelo al adaptador

        listView.setAdapter(adapter);//Muestre-renderise la lista*/Le digo al adapter que llene la lista

        btn_show_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListViewActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btn_delet_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                connection.deletAllProducts();// Eliminamos todas las ubicaiones de la BD
                listProductos.clear();// Vaciamos a lista
                adapter.notifyDataSetChanged();// Le noticamos al adaptado que cambio su lista
            }
        });
    }
}



