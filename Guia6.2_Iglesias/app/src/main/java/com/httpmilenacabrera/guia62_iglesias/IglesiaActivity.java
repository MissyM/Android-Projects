package com.httpmilenacabrera.guia62_iglesias;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

//********Activity quue despliega cada iglesia***************

public class IglesiaActivity extends AppCompatActivity {
    Bundle extras;

    ImageView foto;
    TextView descripcion;
    MediaPlayer audio;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iglesia);

        foto = (ImageView) findViewById(R.id.fotoiglesia);
        descripcion = (TextView) findViewById(R.id.descripcion);
        MediaPlayer mediaPlayer = MediaPlayer.create(, R.raw.audio);
        mediaPlayer.start(); // no need to call prepare(); create() does that for you


        extras = getIntent().getExtras();
        foto.setImageResource((Integer) extras.get("foto"));
        descripcion.setText(getResources().getString(extras.getInt("descripcion")));

    }

    public void startAudio(){
        audio.start();
    }

}
