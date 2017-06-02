package com.milenacabrera.miescuelaapp;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;


import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.milenacabrera.miescuelaapp.Model.Connection;
import com.milenacabrera.miescuelaapp.Model.LocationModel;

import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {


    LocationManager locationManager;
    Location location;
    private GoogleMap mMap;
    private Marker myMarker; //Variable que guarda
    private ArrayList<Marker> markerList;//Array que guaarda la longitud y latitud

   ListView ListView;


    double lat = 0.0;
    double lng = 0.0;
    Button btn_lista;
    Button btn_marca;

    Connection connection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        //Instanciaamos la clase que nos da conección con la base de datos
        connection = new Connection(getApplicationContext());

        btn_lista = (Button)findViewById(R.id.btn_lista);
        btn_marca = (Button)findViewById(R.id.btn_marca);

        markerList = new ArrayList<Marker>();

//Boton que guarda las posiciones
        btn_marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                markerList.add(addMarker(lat, lng));//Guardo los marcadores cuando de click
                connection.insertLocation(lat, lng);
            }
        });

        //Boton que muestra la lista
        btn_lista.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MapsActivity.this,ListLocationActivity.class);
                startActivity(intent);


            }
        });
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        for(Marker m : markerList){
            m.remove();
        }
        ArrayList<LocationModel> myLocs = connection.getLocations();//Traigo las ubicaciones y las pongo en el mapa
        for (LocationModel loc : myLocs) {
            markerList.add(addMarker(loc.lat, loc.lng));
        }
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        myLocation();
        ArrayList<LocationModel> myLocs = connection.getLocations();//Traigo las ubicaciones y las pongo en el mapa
        for (LocationModel loc : myLocs) {
            markerList.add(addMarker(loc.lat, loc.lng));
        }
    }

    //Metodo que me permite agregar  el marcador de mi posiciín en el mapa
    public void addMyMarker(double lat, double lng) {
        LatLng coordenadas = new LatLng(lat,lng);
        CameraUpdate mylocation = CameraUpdateFactory.newLatLngZoom(coordenadas, mMap.getCameraPosition().zoom);//Centramos el myMarker de una posición a otra
        if(myMarker != null)
            myMarker.remove();
        myMarker = mMap.addMarker(new MarkerOptions()
                .position(coordenadas)
                .title(getString(R.string.iamhere))
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.here)));
        mMap.animateCamera(mylocation);//Aniima la camara para irse a la posición deseada
    }
//Método que me permite colocar un marcador en el mapa
    public Marker addMarker(double lat, double lng) {
        LatLng coordenadas = new LatLng(lat,lng);
        return mMap.addMarker(new MarkerOptions()
                .position(coordenadas)
                .title(getString(R.string.saved))
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.saved)));
    }
//Metodo que me permite actualizar mi ubicación
    private void updateLocation(Location location){
        if(location != null){
            lat = location.getLatitude();
            lng = location.getLongitude();
            addMyMarker(lat,lng);
        }
    }

    LocationListener locationListener = new LocationListener() {
        @Override
        public void onLocationChanged(Location location) {
            updateLocation(location);
        }
        @Override
        public void onStatusChanged(String s, int i, Bundle bundle) {
        }
        @Override
        public void onProviderEnabled(String s) {
        }
        @Override
        public void onProviderDisabled(String s) {
        }
    };

    private void myLocation(){

        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) !=
                PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(this,
                        android.Manifest.permission.ACCESS_COARSE_LOCATION) !=
                        PackageManager.PERMISSION_GRANTED) {return;}

        locationManager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);
        location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
        updateLocation(location);

        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,10000,0,locationListener);
    }
    public void fillList() {



    }
}
