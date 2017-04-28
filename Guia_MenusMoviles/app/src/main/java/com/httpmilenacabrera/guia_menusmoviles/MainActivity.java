package com.httpmilenacabrera.guia_menusmoviles;

import android.content.Intent;
import android.provider.Telephony;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnMenu = (Button) findViewById(R.id.btnmenu);
        registerForContextMenu(btnMenu);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_contextual, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Intent ventana;
        switch (item.getItemId()) {
            case R.id.mensaje1:
                ventana = new Intent(MainActivity.this, Mensaje2Activity.class);
                startActivity(ventana);
                return true;
            case R.id.mensaje2:
                ventana = new Intent(MainActivity.this, Mensaje3Activity.class);
                startActivity(ventana);
                return true;
            case R.id.submensaje1:
                ventana = new Intent(MainActivity.this,Mensaje2Activity.class);
                startActivity(ventana);
                return true;
            case R.id.submensaje2:
                ventana = new Intent(MainActivity.this,Mensaje3Activity.class);
                startActivity(ventana);
                return true;
            default:
                return false;
        }
    }
}

/*Implementación para el menu

@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent ventana;
        switch (item.getItemId()) {
            case R.id.mensaje1:
                ventana = new Intent(MainActivity.this,Mensaje2Activity.class);
                startActivity(ventana);
                return true;
            case R.id.mensaje2:
                ventana = new Intent(MainActivity.this,Mensaje3Activity.class);
                startActivity(ventana);
                return true;
            case R.id.mensaje3:
                ventana = new Intent(MainActivity.this,Mensaje4Activity.class);
                startActivity(ventana);
                return true;
            default:
                return false;
        }*/


/*Implementación Submenus
@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent ventana;
        switch (item.getItemId()) {
            case R.id.mensaje1:
                ventana = new Intent(MainActivity.this,Mensaje2Activity.class);
                startActivity(ventana);
                return true;
            case R.id.mensaje2:
                ventana = new Intent(MainActivity.this,Mensaje3Activity.class);
                startActivity(ventana);
                return true;

            case R.id.submensaje1:
                ventana = new Intent(MainActivity.this,Mensaje2Activity.class);
                startActivity(ventana);
                return true;
            case R.id.submensaje2:
                ventana = new Intent(MainActivity.this,Mensaje3Activity.class);
                startActivity(ventana);
                return true;
            default:
                return false;
        }

    }*/