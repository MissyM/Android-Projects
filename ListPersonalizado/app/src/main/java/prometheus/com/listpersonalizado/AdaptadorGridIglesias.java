package prometheus.com.listpersonalizado;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Prometheus on 11/04/2017.
 */

public class AdaptadorGridIglesias extends BaseAdapter {
    List<ItemIglesia> igles;
    Context contexto;

    public AdaptadorGridIglesias(List<ItemIglesia> igles, Context contexto) {
        this.igles = igles;
        this.contexto = contexto;
    }

    @Override
    public int getCount() {
        return igles.size();
    }

    @Override
    public Object getItem(int position) {
        return igles.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(contexto,R.layout.griditem,null);

        ImageView imagen = (ImageView) v.findViewById(R.id.imgIgle2);
        TextView texto = (TextView) v.findViewById(R.id.txtItemGridNombreIgle);

        imagen.setImageResource(igles.get(position).getImagen());
        texto.setText(igles.get(position).getNombre());

        return v;
    }
}
