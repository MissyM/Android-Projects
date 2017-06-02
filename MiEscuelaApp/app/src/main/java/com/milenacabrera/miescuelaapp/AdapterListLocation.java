package com.milenacabrera.miescuelaapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.milenacabrera.miescuelaapp.Model.Connection;
import com.milenacabrera.miescuelaapp.Model.LocationModel;

import java.util.ArrayList;

/**
 * Created by mile on 19/05/17.
 */

public class AdapterListLocation extends BaseAdapter {

    private Context context;
    Connection connection;
    private ArrayList<LocationModel>  listLocations;

    // Creo el constructor
    public AdapterListLocation(Context context, ArrayList<LocationModel> lista) {
        this.context = context;
        this.listLocations = lista;
    }
    //Método que retorna el tamaño de la lista
    @Override
    public int getCount()
    {
        return listLocations.size();
    }
    //Método que retornar el objeto item
    @Override
    public Object getItem(int position)
    {
        return listLocations.get(position);
    }
    //Método que retorna la posición
    @Override
    public long getItemId(int position) {

        return listLocations.get(position).id;//Del objeto obtengo la posición de donde a su vez obtengo el Id
    }
    //Método que infla el layout que contiene los items
    @Override
    public View getView(final int position, final View view, final ViewGroup viewGroup) {
        //Declaramos una variable de tipo View que nos almacena la vista que inflamos
        View v = View.inflate(context,R.layout.item_location,null);
        connection = new Connection(context);


        //Referenciamos las vistas del layout que acabamos de inflar
        ImageView ImageViewLoc = (ImageView)v.findViewById(R.id.saved);
        TextView TxtLatitud = (TextView)v.findViewById(R.id.latitud);
        TextView TxtLongitud = (TextView)v.findViewById(R.id.longitud);
        ImageView ImageViewGarb = (ImageView)v.findViewById(R.id.trash);


        //Seteamos el contenido de listLocations- unimos la vista del item con los datos
        TxtLatitud.setText(listLocations.get(position).lat.toString());
        TxtLongitud.setText(listLocations.get(position).lng.toString());
        ImageViewLoc.setImageResource(R.mipmap.saved);
        ImageViewGarb.setImageResource(R.drawable.trash_can);

        ImageViewGarb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Long id = listLocations.get(position).id;
                connection.deleteLocation(id);
                listLocations.remove(position);
                notifyDataSetChanged();
            }
        });


        return v;


    }
}
