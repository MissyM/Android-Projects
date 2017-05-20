package com.milenacabrera.adapterflipperex;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterViewFlipper;

import com.milenacabrera.adapterflipperex.adapters.CustomFlipperAdapter;

//import com.harold.adapterflipperexample.adapters.CustomFlipperAdapter;

public class MainActivity extends AppCompatActivity {


    AdapterViewFlipper adapterViewFlipper;

    int[]images = {R.drawable.mario_1,R.drawable.mario_2};
    String[] names = {"Mario 1", "Mario 2"};

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
