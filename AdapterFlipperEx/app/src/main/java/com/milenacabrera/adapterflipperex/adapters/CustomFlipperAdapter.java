package com.milenacabrera.adapterflipperex.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.milenacabrera.adapterflipperex.R;


/**
 * Created by milenacabrera on 5/3/17.
 */

public class CustomFlipperAdapter  extends BaseAdapter{

    Context context;
    int[] images;
    String[] names;
    LayoutInflater layoutInflater;


    public CustomFlipperAdapter(Context context, int[] images, String[] names) {
        this.context = context;
        this.images = images;
        this.names = names;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = layoutInflater.inflate(R.layout.list_item, null);

        TextView name = (TextView)view.findViewById(R.id.tv_name);
        ImageView image = (ImageView)view.findViewById(R.id.iv_image);

        name.setText(names[i]);
        image.setImageResource(images[i]);

        return view;


    }
}
