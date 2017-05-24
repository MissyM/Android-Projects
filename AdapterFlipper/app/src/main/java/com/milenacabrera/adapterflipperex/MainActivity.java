package com.milenacabrera.adapterflipperex;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterViewFlipper;

import com.milenacabrera.adapterflipperex.adapters.CustomFlipperAdapter;

import static android.net.wifi.WifiConfiguration.Status.strings;
import static com.milenacabrera.adapterflipperex.R.string.brush_teeth;



public class MainActivity extends AppCompatActivity {


    AdapterViewFlipper adapterViewFlipper;

    int[]images = {R.drawable.habito1,R.drawable.habito2,R.drawable.habito3,R.drawable.habito4,R.drawable.habito5};
    String[] names = {"Lavarse los dientes", "Lavarse las manos","Comer bien","Bañarse a diario","Desansar bien"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapterViewFlipper = (AdapterViewFlipper) findViewById(R.id.AVP);

        CustomFlipperAdapter adaptes = new CustomFlipperAdapter(this,images,names);

        adapterViewFlipper.setAdapter(adaptes);

        adapterViewFlipper.setFlipInterval(2000);
        adapterViewFlipper.setAutoStart(true);

    }
}
