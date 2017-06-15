package com.httpmilenacabrera.guia62_iglesias;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

//********Activity quue despliega cada iglesia***************

public class IglesiaActivity extends AppCompatActivity {
    Bundle extras;

    ImageView foto;
    TextView descripcion;
    Button btn_audio;
    MediaPlayer audio;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iglesia);

        foto = (ImageView) findViewById(R.id.fotoiglesia);
        descripcion = (TextView) findViewById(R.id.descripcion);
        btn_audio = (Button)findViewById(R.id.audio);


        extras = getIntent().getExtras();
        foto.setImageResource((Integer) extras.get("foto"));
        descripcion.setText(getResources().getString(extras.getInt("descripcion")));
        audio = MediaPlayer.create(IglesiaActivity.this, extras.getInt("audio"));

        btn_audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audio.start();
            }
        });
    }
}
