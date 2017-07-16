package com.milenacabrera.recyclerviewapplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mile on 15/06/17.
 */

public class Contact {
    public String nombre;
    public String telefono;
    public int foto;

    public Contact(String nombre, String telefono, int foto) {
        this.nombre = nombre;
        this.telefono= telefono;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {this.telefono = telefono;}

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public static List<Contact> getListContactos () {

        List<Contact> contactList = new ArrayList<>();
        contactList.add(new Contact("Mario Perez", "1234", R.drawable.apu ));
        contactList.add(new Contact("Pedro Pino","4321", R.drawable.burns ));
        contactList.add(new Contact("Jose Solis","2341", R.drawable.skinner ));
        contactList.add(new Contact("Felix Daza", "2431", R.drawable.barney ));
        contactList.add(new Contact("Julio Dias","1423", R.drawable.flanders ));

        return contactList;
    }
}
