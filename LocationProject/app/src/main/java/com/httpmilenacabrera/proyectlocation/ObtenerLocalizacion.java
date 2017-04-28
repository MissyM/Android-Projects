package com.httpmilenacabrera.proyectlocation;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import java.util.List;

import static android.location.LocationManager.NETWORK_PROVIDER;


public class ObtenerLocalizacion extends AppCompatActivity {
    LocationManager locationManager; //Variable que me permite obtener el servicio
    Location location;//Variable que me permite obtener las coordenada

    TextView latitud, longitud;//Variables que me permiten referenciar los elementos

    Button btn_ubicacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        //Referencio los elementos de mi layout
        btn_ubicacion = (Button) findViewById(R.id.btn_ubicar);
        latitud = (TextView) findViewById(R.id.latitud);
        longitud = (TextView) findViewById(R.id.longitud);

        location = getLastKnownLocation();
        //Mediante el botón, mostramos nuestra localización en los textview así:
        btn_ubicacion.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (location != null) {
                    latitud.setText("" + String.valueOf(location.getLatitude()));
                    longitud.setText("" + String.valueOf(location.getLongitude()));
                }
            }
        });
    }

    private Location getLastKnownLocation() {
        locationManager = (LocationManager)getApplicationContext().getSystemService(LOCATION_SERVICE);
        List<String> providers = locationManager.getProviders(true);
        Location bestLocation = null;
        for (String provider : providers) {
            try {
                Location l = locationManager.getLastKnownLocation(provider);
                if (l == null) {
                    continue;
                }
                if (bestLocation == null || l.getAccuracy() < bestLocation.getAccuracy()) {
                    // Found best last known location: %s", l);
                    bestLocation = l;
                }
            } catch (SecurityException e) {
                Log.e("Location Manager Error", "Esto se cagó");
            }
        }
        return bestLocation;
    }
}
