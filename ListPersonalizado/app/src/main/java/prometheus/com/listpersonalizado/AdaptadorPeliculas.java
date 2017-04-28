package prometheus.com.listpersonalizado;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Prometheus on 3/04/2017.
 */

public class AdaptadorPeliculas extends BaseAdapter {
    Context context;
    List<Peliculas> lista;

    public AdaptadorPeliculas(Context context, List<Peliculas> lista) {
        this.context = context;
        this.lista = lista;
    }

    @Override
    public int getCount()
    {
        return lista.size();
    }

    @Override
    public Object getItem(int position)
    {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = View.inflate(context,R.layout.itempelicula,null);

        ImageView imagen = (ImageView) v.findViewById(R.id.imgPoster);
        TextView titulo = (TextView) v.findViewById(R.id.txtTituloPeli);
        TextView director = (TextView) v.findViewById(R.id.txtDirectorPeli);

        titulo.setText(lista.get(position).getTitulo());
        director.setText(lista.get(position).getDirector());
        imagen.setImageResource(lista.get(position).getImagen());


        return v;
    }
}
