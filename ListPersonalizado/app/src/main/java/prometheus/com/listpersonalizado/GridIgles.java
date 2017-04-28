package prometheus.com.listpersonalizado;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridLayout;
import android.widget.GridView;

import java.util.LinkedList;
import java.util.List;

public class GridIgles extends AppCompatActivity {

    List<ItemIglesia> igles;
    AdaptadorGridIglesias adaptador;
    GridView grid;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_igles);

        grid = (GridView) findViewById(R.id.grdIgles);

        Cargar();

        adaptador = new AdaptadorGridIglesias(igles,this);

        grid.setAdapter(adaptador);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                intent = new Intent(GridIgles.this,Iglesia.class);
                intent.putExtra("nom",igles.get(position).getNombre());
                intent.putExtra("desc",igles.get(position).getDescripcion());
                intent.putExtra("dir",igles.get(position).getDireccion());
                intent.putExtra("img",igles.get(position).getImagen());
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menulist,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        Intent ventana;
        switch (item.getItemId())
        {
            case R.id.itmList:
                ventana = new Intent(GridIgles.this,ListaIglesias.class);
                startActivity(ventana);
                return true;
            case R.id.itmGrid:
                ventana = new Intent(GridIgles.this,GridIgles.class);
                startActivity(ventana);
                return true;
            default:
                return false;
        }
    }

    public void Cargar()
    {
        igles = new LinkedList<>();
        igles.add(new ItemIglesia("Basilica de nuestra Señora de la Asunción","La Catedral Basílica Metropolitana de Nuestra Señora de la Asunción es una iglesia catedralicia de culto católico dedicada a la Virgen María bajo la advocación de Nuestra Señora de la Asunción de Popayán.","CALLE 5 # 6-71",R.drawable.catedral));
        igles.add(new ItemIglesia("Iglesia de Santo Domingo","El primer convento que hubo en la ciudad (1552 fue el de los Dominicos). El templo fue construido de tapia y cubierto de paja. El terremoto dcl 2 de febrero de 1736 lo arruinó, lo mismo que el convento.","Calle 4 #4-15",R.drawable.domingo));
        igles.add(new ItemIglesia("Iglesia San Francisco","La iglesia de San Francisco de Popayán es uno de los templos más importantes de Colombia por su estilo barroco tardío neogranadino.","Carrera 9 # 3-74",R.drawable.francisco));

    }
}
