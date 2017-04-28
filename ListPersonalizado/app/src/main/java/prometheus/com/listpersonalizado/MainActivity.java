package prometheus.com.listpersonalizado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Peliculas> pelis;
    ListView lisPeli;
    AdaptadorPeliculas adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lisPeli = (ListView) findViewById(R.id.lstPelis);

        cargar();

        adaptador = new AdaptadorPeliculas(this,pelis);

        lisPeli.setAdapter(adaptador);
    }

    public void cargar()
    {
        pelis = new LinkedList<Peliculas>();
        pelis.add(new Peliculas("Ghost in the Shell","Rupert Sanders",R.mipmap.ic_launcher));
        pelis.add(new Peliculas("Guardians of the Galaxy","James Gunn",R.mipmap.ic_launcher));
        pelis.add(new Peliculas("Brave","Brenda Chapman, Mark Andrews",R.mipmap.ic_launcher));
        pelis.add(new Peliculas("The Way of the Peaceful Warrior","Dann Milman",R.mipmap.ic_launcher));
    }
}
