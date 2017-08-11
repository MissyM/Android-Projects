package com.milenacabrera.requestapp;

import android.support.v4.app.INotificationSideChannel;

/**
 * Created by mile on 1/08/17.
 */

public class User {
    private String iduser;
    private String name;
    private String username;
    private String email;
    private String phone;
    private String website;

    public User () {

    }

    public User(String iduser, String name, String username, String email, String phone, String website) {
        this.iduser = iduser;
        this.name = name;
        this.username = username;
        this.email = phone;
        this.website = website;
    }

    public String getIduser() {
        return iduser;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
