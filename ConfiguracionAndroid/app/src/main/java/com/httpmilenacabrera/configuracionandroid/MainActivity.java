package com.httpmilenacabrera.configuracionandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnJugadores, btnModelos, btnCerrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnJugadores = (Button)findViewById(R.id.btnjugadores);
        btnModelos = (Button)findViewById(R.id.btnmodelos);
        btnCerrar = (Button)findViewById(R.id.btncerrar);




    }

    @Override
    public View findViewById(int id) {
        return super.findViewById(id);
    }

    public void goPlayers(View view) {
        Intent intent = new Intent(this,Jugadores.class);
        startActivity(intent);
    }
    public void goModels(View view) {
        Intent intent = new Intent(this,Modelos.class);
        startActivity(intent);
    }
    public void exit(View view) {
        System.exit(0);
    }
}
