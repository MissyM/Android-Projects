package com.httpmilenacabrera.guia1_1_2viewsbasicos_manejodeimagenes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class rotar_imagen extends AppCompatActivity {

    ImageView imgUno;
    int giro;
    boolean isBig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        giro = 0;
        isBig = true;
        setContentView(R.layout.activity_rotar_imagen);
        imgUno = (ImageView)findViewById(R.id.imgUno);
        Picasso.with(imgUno.getContext()).load("https://cdn-jr.brainpop.com/artsandtechnology/art/pablopicasso/screenshot_1.png")
                .placeholder(R.drawable.error)
                .into(imgUno);
    }

    public void  goLeft(View view) {
        giro -= 4;
        Picasso.with(this).load("https://cdn-jr.brainpop.com/artsandtechnology/art/pablopicasso/screenshot_1.png")
                .rotate(giro)                             // optional
                .into(imgUno);
    }
    public void  goRight(View view){
        giro += 4;
        Picasso.with(this).load("https://cdn-jr.brainpop.com/artsandtechnology/art/pablopicasso/screenshot_1.png")
                .rotate(giro)                             // optional
                .into(imgUno);
    }
    public void  goBig(View view){
        isBig = !isBig;
        if (isBig) {
            Picasso.with(this).load("https://cdn-jr.brainpop.com/artsandtechnology/art/pablopicasso/screenshot_1.png")
                    .resize(50, 50)                             // optional
                    .into(imgUno);
        } else {
            Picasso.with(this).load("https://cdn-jr.brainpop.com/artsandtechnology/art/pablopicasso/screenshot_1.png")
                    .resize(10, 10)                             // optional
                    .into(imgUno);
        }

    }
}
