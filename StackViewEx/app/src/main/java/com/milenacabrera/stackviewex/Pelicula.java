package com.milenacabrera.stackviewex;

/**
 * Created by mile on 24/05/17.
 */

public class Pelicula {
    int nombre;
    int img;
    int sinapsis;
    int reparto;
    int director;

    public Pelicula(int nombre, int img, int sinapsis, int reparto, int director) {
        this.nombre = nombre;
        this.img = img;
        this.sinapsis = sinapsis;
        this.reparto = reparto;
        this.director = director;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getSinapsis() {
        return sinapsis;
    }

    public void setSinapsis(int sinapsis) {
        this.sinapsis = sinapsis;
    }

    public int getReparto() {
        return reparto;
    }

    public void setReparto(int reparto) {
        this.reparto = reparto;
    }

    public int getDirector() {
        return director;
    }

    public void setDirector(int director) {
        this.director = director;
    }
}
