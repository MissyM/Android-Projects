package com.milenacabrera.sugarapplication.Model;

import com.orm.SugarRecord;

/**
 * Created by mile on 13/06/17.
 */

public class Datos extends SugarRecord {

    String name;
    String lastname;
    String address;
    String phone;

    public Datos() {

    }

    public Datos(String name, String lastname, String address, String phone) {

        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
