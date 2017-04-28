package com.httpmilenacabrera.actividadcontrolesdeseleccion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FeaturesActivity extends AppCompatActivity {

    ImageView logo;
    TextView txtfeatures;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_features);

        logo = (ImageView)findViewById(R.id.logo);
        txtfeatures = (TextView)findViewById(R.id.caracteristics);

        Bundle extras = getIntent().getExtras();
        String lenguaje = extras.getString("lenguaje");
        showLanguage(lenguaje);
    }

    public void showLanguage(String lenguaje) {

        switch (lenguaje) {
            case "JavaScript":
                txtfeatures.setText(R.string.featuresjs);
                logo.setBackgroundResource(R.drawable.js);
                break;
            case "C":
                txtfeatures.setText(R.string.featuresc);
                logo.setBackgroundResource(R.drawable.c);
                break;
            case "Python":
                txtfeatures.setText(R.string.featurespython);
                logo.setBackgroundResource(R.drawable.phyton);
                break;
            case "PHP":
                txtfeatures.setText(R.string.featuresphp);
                logo.setBackgroundResource(R.drawable.php);
                break;
            case "Java":
                txtfeatures.setText(R.string.featuresjava);
                logo.setBackgroundResource(R.drawable.java);
                break;
            case "Ruby":
                txtfeatures.setText(R.string.featuresruby);
                logo.setBackgroundResource(R.drawable.ruby);
                break;

        }

    }

}
