package com.milenacabrera.recyclerviewapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class RecyclerActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Contact> contactos; // Es donde se muestra nuestro recycler
    AdapterRecycler adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        recyclerView =(RecyclerView)findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        List<Contact> contactos = Contact.getListContactos();
        adaptador = new AdapterRecycler(contactos);
        recyclerView.setAdapter(adaptador);
    }
}
