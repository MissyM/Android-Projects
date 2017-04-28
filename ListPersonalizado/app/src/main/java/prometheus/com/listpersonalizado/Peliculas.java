package prometheus.com.listpersonalizado;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Prometheus on 3/04/2017.
 */

public class Peliculas
{
    private String titulo;
    private String director;
    private int imagen;


    public Peliculas(String titulo, String director, int imagen) {
        this.titulo = titulo;
        this.director = director;
        this.imagen = imagen;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getDirector() {
        return director;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getImagen() {
        return imagen;
    }

}
