package com.milenacabrera.sqlitedatabase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.milenacabrera.sqlitedatabase.Models.Registro;

import java.util.List;

public class ListViewRegistroActivity extends AppCompatActivity {

    List<Registro> datosRegistro;
    AdapterRegistro adapterRegistro;
    ListView listView;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_registro);

        listView = (ListView)findViewById(R.id.list_view);

        adapterRegistro = AdapterRegistro(this.datosRegistro);

    }
}
