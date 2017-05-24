package com.milenacabrera.imagesswitcher_textswitcher;

import android.app.ActionBar;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {
    int cont = 1;
    private ImageSwitcher sw;
    private TextSwitcher tw;
    String [] texto ={"Homero en apuros" , "Homero feliz"};
    int indice = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.button);

       sw = (ImageSwitcher) findViewById(R.id.imageSwitcher);
       tw = (TextSwitcher) findViewById(R.id.textSwitcher);
        setFactory();
        loadAnimations();
        sw.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView myView = new ImageView(getApplicationContext());
                myView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                myView.setLayoutParams(new
                        ImageSwitcher.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT,
                        ActionBar.LayoutParams.WRAP_CONTENT));
                return myView;
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Siguiente",
                        Toast.LENGTH_LONG).show();

                if(cont%2 == 0){
                    sw.setImageResource(R.drawable.h1);
                    cont++;
                }else{
                    sw.setImageResource(R.drawable.h2);
                    cont++;
                }

                indice++;
                if(indice<2) {
                    tw.setText(texto[indice]);
                }
                if(indice ==2){
                    indice =0;
                }
            }
        });
    }
    void loadAnimations(){

        Animation in = AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        Animation out = AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);

        tw.setAnimation(in);
        tw.setAnimation(out);
    }

    void setFactory(){

        tw.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                TextView view = new TextView(MainActivity.this);
                view.setGravity(Gravity.CENTER_HORIZONTAL);
                view.setTextSize(25);
                view.setTextColor(Color.RED);
                return view;
            }
        });
    }

}
