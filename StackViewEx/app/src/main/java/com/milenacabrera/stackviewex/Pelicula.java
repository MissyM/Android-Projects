package com.milenacabrera.stackviewex;

/**
 * Created by mile on 24/05/17.
 */

public class Pelicula {
    String nombre;
    int img;
    String sinapsis;
    String reparto;
    String director;

    public Pelicula(String nombre, int img, String sinapsis, String reparto, String director) {
        this.nombre = nombre;
        this.img = img;
        this.sinapsis = sinapsis;
        this.reparto = reparto;
        this.director = director;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getSinapsis() {
        return sinapsis;
    }

    public void setSinapsis(String sinapsis) {
        this.sinapsis = sinapsis;
    }

    public String getReparto() {
        return reparto;
    }

    public void setReparto(String reparto) {
        this.reparto = reparto;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
