package com.milenacabrera.colombinaapplication.Control;

/**
 * Created by mile on 30/05/17.
 */

public class Producto {

    public int codigo;
    public String nombre;
    public String url;
    public int cantidad;
    public String empleado;

    public Producto(int codigo, String nombre, String url, int cantidad, String empleado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.url = url;
        this.cantidad = cantidad;
        this.empleado = empleado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }
}