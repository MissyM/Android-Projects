package com.milenacabrera.stackviewex;

/**
 * Created by mile on 24/05/17.
 */

public class StackItemPictures {
    private String texto;
    private int img;

    public StackItemPictures(String texto, int img) {
        this.texto = texto;
        this.img = img;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}

