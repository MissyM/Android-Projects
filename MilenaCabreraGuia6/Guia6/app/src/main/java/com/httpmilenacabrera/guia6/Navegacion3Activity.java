package com.httpmilenacabrera.guia6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Navegacion3Activity extends AppCompatActivity implements View.OnClickListener {

    Button btnverde, btnamarillo, btnrojo;
    TextView txtverde , txtamarillo, txtrojo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegacion3);

        txtverde = (TextView) findViewById(R.id.txtuno);
        txtverde.setOnClickListener(this);
        txtamarillo = (TextView) findViewById(R.id.txtdos);
        txtamarillo.setOnClickListener(this);
        txtrojo = (TextView) findViewById(R.id.txttres);
        txtrojo.setOnClickListener(this);
        btnverde = (Button) findViewById(R.id.btnuno);
        btnverde.setOnClickListener(this);
        btnamarillo = (Button) findViewById(R.id.btndos);
        btnamarillo.setOnClickListener(this);
        btnrojo =(Button)findViewById(R.id.btntres);
        btnrojo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnuno:
                txtverde.setText("GREEN");
                break;
            case R.id.btndos:
                txtamarillo.setText("YELLOW");
                break;
            case R.id.btntres:
                txtrojo.setText("RED");
            case R.id.txtuno:
                txtverde.setText(" ");
                break;
            case R.id.txtdos:
                txtamarillo.setText(" ");
                break;
            case R.id.txttres:
                txtrojo.setText(" ");
                break;
        }
    }
}
