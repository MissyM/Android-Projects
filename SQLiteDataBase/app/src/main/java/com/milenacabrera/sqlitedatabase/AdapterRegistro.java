package com.milenacabrera.sqlitedatabase;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.milenacabrera.sqlitedatabase.Models.Registro;

import java.util.List;

/**
 * Created by mile on 25/05/17.
 */

public class AdapterRegistro extends BaseAdapter {

    Context context;
    List<Registro> datosRegistro;

    public AdapterRegistro(Context context, List<Registro> datosRegistro) {
        this.context = context;
        this.datosRegistro = datosRegistro;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Almacenamos la vista que inflamos
        View v = View.inflate(context,R.layout.item,null);

        //Referenciamos los elementos del item que acabamos de inflar
        TextView textViewnombre = (TextView)v.findViewById(R.id.nombre);
        TextView textViewapellido = (TextView)v.findViewById(R.id.apellido);

        //Seteams los elementos
        textViewnombre.setText(datosRegistro.get(position).getNombre());
        textViewapellido.setText(datosRegistro.get(position).getApellido());


        return v;
    }
}
