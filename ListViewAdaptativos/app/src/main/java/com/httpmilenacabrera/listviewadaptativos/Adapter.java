package com.httpmilenacabrera.listviewadaptativos;

import android.content.Context;
import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.httpmilenacabrera.listviewadaptativos.model.Pelicula;

import java.util.List;

/**
 * Created by mile on 3/04/17.
 */

public class Adapter extends BaseAdapter{

    private Context context;
    private List<Pelicula> datosLista;

    public Adapter() {
    }

    // Creo el constructor
    public Adapter(Context context, List<Pelicula> lista) {
        this.context = context;
        this.datosLista = lista;
    }
//Método que retorna el tamaño de la lista
    @Override
    public int getCount()
    {
        return datosLista.size();
    }
//Método que retornar el objeto item
    @Override
    public Object getItem(int position)
    {
        return datosLista.get(position);
    }
//Método que retorna la posición
    @Override
    public long getItemId(int position) {

        return datosLista.get(position).getId();//Del objeto obtengo la posición de donde a su vez obtengo el Id
    }
//Método que infla el layout que contiene los items
    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        //Declaramos una variable de tipo View que nos almacena la vista que inflamos
        View v = View.inflate(context,R.layout.itempelicula,null);

        //Referenciamos las vistas del layout que acabamos de inflar
        ImageView ImageView = (ImageView)v.findViewById(R.id.img_movie);
        TextView TxtAutor = (TextView)v.findViewById(R.id.title);
        TextView TxtTitulo = (TextView)v.findViewById(R.id.autor);

        //Seteamos el contenido el contenido de datosLista
        TxtAutor.setText(datosLista.get(position).getAutor());
        TxtTitulo.setText(datosLista.get(position).getTitle());
        ImageView.setImageResource(datosLista.get(position).getImage());

        return v;


    }
}
