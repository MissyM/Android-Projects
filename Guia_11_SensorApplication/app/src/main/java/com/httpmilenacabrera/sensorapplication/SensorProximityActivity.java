package com.httpmilenacabrera.sensorapplication;

import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class SensorProximityActivity extends AppCompatActivity implements SensorEventListener{
//Declaro las variables

    RelativeLayout relativeLayout;
    Sensor typesensor;
    SensorManager sensormanager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_proximity);

        relativeLayout= (RelativeLayout) findViewById(R.id.activity_sensor_proximity);

        sensormanager = (SensorManager) getSystemService(SENSOR_SERVICE);
        typesensor = sensormanager.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        sensormanager.registerListener(this,typesensor,SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        Toast.makeText(SensorProximityActivity.this,"Valor Sensor" + event.values[0],Toast.LENGTH_SHORT).show();

        if(event.values[0] == 0){

            relativeLayout.setBackgroundColor(Color.BLUE);

        }else
        {

            relativeLayout.setBackgroundColor(Color.GREEN);

        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
