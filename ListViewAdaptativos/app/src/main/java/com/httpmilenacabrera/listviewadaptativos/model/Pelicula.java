package com.httpmilenacabrera.listviewadaptativos.model;

/**
 * Created by mile on 3/04/17.
 */
//CONSTRUCTOR
public class Pelicula {
    private String title;
    private String autor;
    private int image;
    private long id;
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getAutor() {

        return autor;
    }

    public void setAutor(String autor) {

        this.autor = autor;
    }

    public int getImage() {

        return image;
    }

    public void setImage(int image) {

        this.image = image;
    }

    public Pelicula(String title, String autor, int image, long id) {

        this.title = title;
        this.autor = autor;
        this.image = image;
        this.id = id;


    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
