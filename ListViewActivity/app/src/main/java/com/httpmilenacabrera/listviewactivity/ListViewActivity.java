package com.httpmilenacabrera.listviewactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {

    ListView paises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        paises = (ListView) findViewById(R.id.paises);
        paises.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position){

                    case 0:
                        Toast.makeText(ListViewActivity.this, "Selecciono Colombia", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(ListViewActivity.this, "Selecciono Chile", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(ListViewActivity.this, "Selecciono Bolivia", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(ListViewActivity.this, "Selecciono Brasil", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(ListViewActivity.this, "Selecciono Perú", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(ListViewActivity.this, "Selecciono Argentina", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        Toast.makeText(ListViewActivity.this, "Selecciono Ecuador", Toast.LENGTH_SHORT).show();
                        break;
                    case 7:
                        Toast.makeText(ListViewActivity.this, "Selecciono Venezuela", Toast.LENGTH_SHORT).show();
                        break;


                }

            }
        });
    }
}
/*
<item>Colombia</item>
        <item>Chile</item>
        <item>Bolivia</item>
        <item>Brasil</item>
        <item>Perú</item>
        <item>Argentina</item>
        <item>Ecuador</item>
        <item>Venezuela</item>*/