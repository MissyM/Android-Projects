package com.milenacabrera.miescuelaapp;

/**
 * Created by mile on 19/05/17.
 */

public class LocationModel {

    public Double lat;
    public Double lng;
    public Long id;

    LocationModel(Long id, Double lat, Double lng ) {
        this.id = id;
        this.lat = lat;
        this.lng = lng;
    }


}
