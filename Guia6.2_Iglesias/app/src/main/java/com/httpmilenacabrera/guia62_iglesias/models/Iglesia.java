package com.httpmilenacabrera.guia62_iglesias.models;

/**
 * Created by mile on 5/04/17.
 */

public class Iglesia {
    private String nombre;
    private int foto;
    private int descripcion;
    private int audio;
    private  long id;

    //Generamos el constructor alt+insert

    public Iglesia(String nombre, int foto, int descripcion,int audio, long id) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.foto = foto;
        this.audio = audio;
        this.id = id;
    }

    //Generamos los métodos para manipular los atributos de la clase


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDescripcion() {return descripcion;}

    public void setDescripcion(int descripcion) {
        this.descripcion = descripcion;
    }


    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getAudio() {return audio;}

    public void setAudio(int audio) {this.audio = audio;}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
