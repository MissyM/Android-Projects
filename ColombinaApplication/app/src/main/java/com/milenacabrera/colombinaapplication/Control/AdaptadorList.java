package com.milenacabrera.colombinaapplication.Control;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.milenacabrera.colombinaapplication.Model.Connection;
import com.milenacabrera.colombinaapplication.R;

import java.util.ArrayList;

/**
 * Created by mile on 30/05/17.
 */

public class AdaptadorList extends BaseAdapter {


    private Context context;
    Connection connection;
    private ArrayList<Producto> listProducto;

    public AdaptadorList(Context context, ArrayList<Producto> listProducto) {
        this.context = context;
        this.connection = connection;
        this.listProducto = listProducto;
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
    public View getView(final int position, View convertView, ViewGroup parent) {

        //Declaramos una variable de tipo View que nos almacena la vista que inflamos
        View v = View.inflate(context, R.layout.item,null);
        connection = new Connection(context);


        //Referenciamos las vistas del layout que acabamos de inflar

        TextView producto = (TextView)v.findViewById(R.id.producto);

        ImageView ImageViewGarb = (ImageView)v.findViewById(R.id.trash);


        //Seteamos el contenido de listLocations- unimos la vista del item con los datos
        producto.setText(listProducto.get(position).nombre.toString());
        ImageViewGarb.setImageResource(R.mipmap.eliminar);

        ImageViewGarb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int codigo = listProducto.get(position).codigo;
                connection.deleteProduct(codigo);
                listProducto.remove(position);
                notifyDataSetChanged();
            }
        });


        return v;
    }
}
