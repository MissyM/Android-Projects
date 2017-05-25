package com.milenacabrera.stackviewex;

import android.content.Context;
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

public class AdapterStack extends ArrayAdapter<StackItemPictures> {
    private List<StackItemPictures> items;
    private Context ctx;

    public AdapterStack(Context context, int resource, List<StackItemPictures> objects) {
        super(context, resource, objects);

        this.items = objects;
        this.ctx = context;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        ImageView imagen = null;
        if (v == null)
        {
            LayoutInflater v1 = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = v1.inflate(R.layout.item,null);
        }

        StackItemPictures s = items.get(position);//Guarda la posición del item

        if (s != null)
        {
            TextView text = (TextView) v.findViewById(R.id.txtItem);
            imagen = (ImageView) v.findViewById(R.id.igmItem);
            if (text != null)
            {
                text.setText(s.getTexto());
                imagen.setImageResource(s.getImg());
            }
        }



        return v;
    }
}