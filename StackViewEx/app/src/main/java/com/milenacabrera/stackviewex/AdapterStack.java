package com.milenacabrera.stackviewex;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mile on 24/05/17.
 */

public class AdapterStack extends ArrayAdapter<Pelicula> {
    private List<Pelicula> peliculas;
    private Context ctx;
    Intent intent;

    public AdapterStack(Context context, int resource, List<Pelicula> objects) {
        super(context, resource, objects);

        this.peliculas = objects;
        this.ctx = context;
    }

    @NonNull
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View v = convertView;
        ImageView imagen;
        if (v == null)
        {
            LayoutInflater v1 = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = v1.inflate(R.layout.item,null);
        }

        Pelicula s = peliculas.get(position);//Guarda la posición del item

        if (s != null)
        {
            TextView text = (TextView) v.findViewById(R.id.txtItem);
            imagen = (ImageView) v.findViewById(R.id.igmItem);
            if (text != null)
            {
                text.setText(s.getNombre());
                imagen.setImageResource(s.getImg());
            }
        }

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pelicula p = peliculas.get(position);

                intent = new Intent(ctx, PeliculaActivity.class);
                intent.putExtra("nom", p.getNombre());
                intent.putExtra("img", p.getImg());
                intent.putExtra("sinop", p.getSinapsis());
                intent.putExtra("prot", p.getReparto());
                intent.putExtra("direc", p.getDirector());
                ctx.startActivity(intent);
            }
        });

        return v;
    }
}