package com.httpmilenacabrera.guia31_alertasydialogos;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

public class AlertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);


    }
    public void toastShort(View v){
        Toast.makeText(this, "Este es un Toast de corta duración",Toast.LENGTH_SHORT).show();
    }
    public void toastLong(View v){
        Toast.makeText(this, "Este es un Toast de larga duración",Toast.LENGTH_LONG).show();
    }
    public void alertDialogok(View v) {
        //Instancia un AlertDialog.Builder con este constructor
        AlertDialog.Builder builder= new AlertDialog.Builder(this);

        builder.setMessage(R.string.dialog_message)
                .setTitle(R.string.dialog_title);

        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(AlertActivity.this, "Usted presionó aceptar", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void alertDialogokcancel(View v) {
        //Instancia un AlertDialog.Builder con este constructor
        AlertDialog.Builder builder= new AlertDialog.Builder(this);

        builder.setMessage(R.string.dialog_message)
                .setTitle(R.string.dialog_title);

        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(AlertActivity.this, "Usted presionó aceptar", Toast.LENGTH_LONG).show();
            }
        });
        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(AlertActivity.this, "Usted presionó cancelar", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
}
