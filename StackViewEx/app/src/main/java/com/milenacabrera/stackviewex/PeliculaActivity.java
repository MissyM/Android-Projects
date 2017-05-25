package com.milenacabrera.stackviewex;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PeliculaActivity extends AppCompatActivity {

    TextView nom;
    ImageView img;
    TextView prot;
    TextView sinop;
    TextView direc;
    Bundle extras;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelicula);

        nom = (TextView)findViewById(R.id.nombre);
        img = (ImageView)findViewById(R.id.img_peli);
        sinop= (TextView)findViewById(R.id.sinopsis);
        prot = (TextView)findViewById(R.id.protagonista);
        direc = (TextView)findViewById(R.id.director);

        extras = getIntent().getExtras();
        nom.setText((getResources().getString(extras.getInt("nom"))));
        img.setImageResource((Integer) extras.get("img"));
        sinop.setText(getResources().getString(extras.getInt("sinop")));
        prot.setText(getResources().getString(extras.getInt("prot")));
        direc.setText(getResources().getString(extras.getInt("direc")));

    }
}
