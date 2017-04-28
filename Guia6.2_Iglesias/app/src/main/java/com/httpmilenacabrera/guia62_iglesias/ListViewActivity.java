package com.httpmilenacabrera.guia62_iglesias;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

/**
 * Created by mile on 11/04/17.
 */


import com.httpmilenacabrera.guia62_iglesias.models.Iglesia;


import java.util.ArrayList;
import java.util.List;

import static com.httpmilenacabrera.guia62_iglesias.R.raw.sound1;
import static com.httpmilenacabrera.guia62_iglesias.R.raw.sound2;
import static com.httpmilenacabrera.guia62_iglesias.R.raw.sound3;
import static com.httpmilenacabrera.guia62_iglesias.R.raw.sound4;

/********************************************MAIN ACTIVITY*****************************************/
public class ListViewActivity extends AppCompatActivity {
    List<Iglesia> datosiglesias;
    AdapterList adapterList;
    ListView listView;
    GridView gridView;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iglesias_listview);

        //Referenciamos el elemento list del activity_iglesias
        listView = (ListView)findViewById(R.id.list);
        gridView = (GridView)findViewById(R.id.grid);
        fillList();//Método que me permite llenar la lista

        //Creamos un objeto de tipo AdapterList llamado adaptador y le pasamos el contexto y la lista de iglesias
        adapterList = new AdapterList(this,datosiglesias);
        listView.setAdapter(adapterList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                intent = new Intent(ListViewActivity.this,IglesiaActivity.class);
                intent.putExtra("nombre",datosiglesias.get(position).getNombre());
                intent.putExtra("descripcion",datosiglesias.get(position).getDescripcion());
                intent.putExtra("foto",datosiglesias.get(position).getFoto());
                intent.putExtra("audio",datosiglesias.get(position).getAudio());
                startActivity(intent);

            }
        });
        gridView.setAdapter(adapterList);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                intent = new Intent(ListViewActivity.this,IglesiaActivity.class);
                intent.putExtra("nombre",datosiglesias.get(position).getNombre());
                intent.putExtra("descripcion",datosiglesias.get(position).getDescripcion());
                intent.putExtra("foto",datosiglesias.get(position).getFoto());
                intent.putExtra("audio",datosiglesias.get(position).getAudio());
                startActivity(intent);

            }
        });


    }//Fin del oncreate


    //Método que llena la lista de elementos
    public void fillList(){
        datosiglesias = new ArrayList<>(); //Inicializo el array
        //Lleno la lista con la función add

        datosiglesias.add(new Iglesia("Belen",R.drawable.belen_a,R.string.BELEN,sound1,1));
        datosiglesias.add(new Iglesia("Catedral",R.drawable.catedral_a,R.string.CATEDRAL,sound2,2));
        datosiglesias.add(new Iglesia("La Ermita",R.drawable.ermita,R.string.ERMITA,sound3,3));
        datosiglesias.add(new Iglesia("San Francisco",R.drawable.sanfrancisco,R.string.SANFRANCISCO,sound4,4));
    }//Fin fillList

    //*****************************************MENU*****************************************************
    //_------------------Método que permite la ejecución del menú-----------------------------------
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Infla el menú, este agrega los items al action bar si este está presente
        getMenuInflater().inflate(R.menu.menu,menu);//asocia el archivo XML que define el contenido del menú con el botón del dispositivo definido para tal fin por
        return true;
    }

    //----------------Método que permite visualizar el ListView | GridView--------------------------
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()) {
            case R.id.item_menugrid:
                gridView.setVisibility(View.VISIBLE);
                listView.setVisibility(View.GONE);
                return true;

            case R.id.item_menulist:
                gridView.setVisibility(View.GONE);
                listView.setVisibility(View.VISIBLE);
                return true; //Lleva a la misma vista
            default:
                return false;
        }

    }
//----------------------------------------------------------------------------------------------

 }