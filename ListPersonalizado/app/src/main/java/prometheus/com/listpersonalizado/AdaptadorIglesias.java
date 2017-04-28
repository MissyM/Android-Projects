package prometheus.com.listpersonalizado;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Prometheus on 10/04/2017.
 */

public class AdaptadorIglesias extends BaseAdapter {
    Context contexto;
    List<ItemIglesia> igles;

    public AdaptadorIglesias(List<ItemIglesia> iglesias, Context contexto) {
        this.igles = iglesias;
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
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View v = View.inflate(contexto,R.layout.itemglesia,null);

        TextView nombre = (TextView) v.findViewById(R.id.txtNombreIg);
        TextView dir = (TextView) v.findViewById(R.id.txtDireccionIgle);
        ImageView foto = (ImageView) v.findViewById(R.id.imgIgle);

        nombre.setText(igles.get(position).getNombre());
        dir.setText(igles.get(position).getDireccion());
        foto.setImageResource(igles.get(position).getImagen());

        return v;
    }
}
