package com.milenacabrera.colombinaapplication.Control;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.milenacabrera.colombinaapplication.Model.Connection;
import com.milenacabrera.colombinaapplication.R;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity implements SensorEventListener {
//Declaro las variables
    Connection connection;
    Sensor typesensor;
    SensorManager sensormanager;
    boolean activo;
    int cont;
    Button btn_activar;
    ImageButton btn_guardar;
    MediaPlayer audio;

    EditText codigo, nombre,  cantidad, empleado, cantidad_sensor,url;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sensormanager = (SensorManager) getSystemService(SENSOR_SERVICE);
        typesensor = sensormanager.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        sensormanager.registerListener(this,typesensor,SensorManager.SENSOR_DELAY_NORMAL);

        btn_activar = (Button) findViewById(R.id.start);
        btn_guardar= (ImageButton) findViewById(R.id.guardar);

        codigo = (EditText)findViewById(R.id.codigo);
        nombre = (EditText)findViewById(R.id.textnombre);
        url = (EditText)findViewById(R.id.url);
        cantidad = (EditText)findViewById(R.id.textcantidad);
        empleado = (EditText)findViewById(R.id.textempleado);
        cantidad_sensor= (EditText)findViewById(R.id.cantidad_sensor);
        audio = MediaPlayer.create(MainActivity.this, R.raw.tone);

        activo = false;
        cont = 0;

        //comparar();



        btn_activar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                activo=true;
            }
        });

        btn_guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cod = Integer.parseInt(codigo.getText().toString());
                String nomb = nombre.getText().toString();
                String u = url.getText().toString();
                int cant = Integer.parseInt(cantidad.getText().toString());
                String emp = empleado.getText().toString();
                String sensor = cantidad_sensor.getText().toString();
                comparar();
                //Insertamos el registro en la base de datos con la
                connection.insertProduct(cod, nomb, u, cant, emp);
                //Selimpia el formulario de registro  al hacer el registro, para que sea llenado nuevamente
                codigo.setText(null);
                nombre.setText("");
                url.setText("");
                cantidad.setText(null);
                empleado.setText("");
                cantidad_sensor.setText("");
            }
        });
    }

    public void comparar() {
        int cant = Integer.parseInt(cantidad.getText().toString());
        if(cant == cont){
            Toast.makeText(getApplicationContext(), "Los datos son correctos ",Toast.LENGTH_LONG).show();
        }else
            Toast.makeText(getApplicationContext(), "Cantidades incorrectas ",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onSensorChanged(SensorEvent event) {

        if(event.values[0] == 0 && activo){

            audio.start();
            cont++;
            cantidad_sensor.setText("" + cont);
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

}