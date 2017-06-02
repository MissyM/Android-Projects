package com.milenacabrera.sqlitedatabase.Models;

/**
 * Created by mile on 25/05/17.
 */

public class Registro {
    int id;
    String nombre;
    String apellido;
    int edad;
    boolean casado;
    boolean soltero;
    boolean femenino;
    boolean masculino;
    boolean ingles;
    boolean espanol;

    public Registro(int id, String nombre, String apellido, int edad, boolean casado, boolean soltero, boolean femenino, boolean masculino, boolean ingles, boolean espanol) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.casado = casado;
        this.soltero = soltero;
        this.femenino = femenino;
        this.masculino = masculino;
        this.ingles = ingles;
        this.espanol = espanol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public boolean isSoltero() {
        return soltero;
    }

    public void setSoltero(boolean soltero) {
        this.soltero = soltero;
    }

    public boolean isFemenino() {
        return femenino;
    }

    public void setFemenino(boolean femenino) {
        this.femenino = femenino;
    }

    public boolean isMasculino() {
        return masculino;
    }

    public void setMasculino(boolean masculino) {
        this.masculino = masculino;
    }

    public boolean isIngles() {
        return ingles;
    }

    public void setIngles(boolean ingles) {
        this.ingles = ingles;
    }

    public boolean isEspanol() {
        return espanol;
    }

    public void setEspanol(boolean espanol) {
        this.espanol = espanol;
    }
}
