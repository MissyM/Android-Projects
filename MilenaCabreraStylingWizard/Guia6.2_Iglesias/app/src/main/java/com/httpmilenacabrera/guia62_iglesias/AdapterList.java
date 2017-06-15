package com.httpmilenacabrera.guia62_iglesias;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.httpmilenacabrera.guia62_iglesias.models.Iglesia;

import java.util.List;

/**
 * Created by mile on 5/04/17.
 */
// Creamos la clase AdapterList que hereda los método de la clase BaseAdapter
public class AdapterList extends BaseAdapter{

    // Creamos el contexto y los datos de la lista

    private Context context;
    private List<Iglesia> datosIglesias;

    //Creamos el constructor

    public AdapterList(Context context, List<Iglesia> datosIglesias) {
        this.context = context;
        this.datosIglesias = datosIglesias;
    }

//Método que retorna el tamño de la lista
    @Override
    public int getCount() {
        return datosIglesias.size();
    }

//Método que retorna el objeto item
    @Override
    public Object getItem(int position) {
        return datosIglesias.get(position);
    }
    //Método que retorna la posición
    @Override
    public long getItemId(int position) {
        return datosIglesias.get(position).getId();
    }

//Método que infla el layout que contiene los items
    @Override
    public View getView(int position, View convertView, ViewGroup viewgrup) {

        //Declaramos una variable de tipo View que nos almacena la vista que inflamos
        View v = View.inflate(context,R.layout.item, null);

        //Referencio las vistas del item que acabo de inflar
        ImageView ImageView = (ImageView)v.findViewById(R.id.img_iglesia);
        TextView Nombre = (TextView)v.findViewById(R.id.txt_nombreiglesia);

        //Seteo el contenido de datosIglesias
        ImageView.setImageResource(datosIglesias.get(position).getFoto());
        Nombre.setText(datosIglesias.get(position).getNombre());
        return v;
    }
}
