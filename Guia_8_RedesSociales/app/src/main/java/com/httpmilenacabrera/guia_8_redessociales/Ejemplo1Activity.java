package com.httpmilenacabrera.guia_8_redessociales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.content.Intent.ACTION_SEND;

public class Ejemplo1Activity extends AppCompatActivity {
    EditText edText;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_ejemplo1);


        edText = (EditText)findViewById(R.id.edTxt);
        btnSend = (Button)findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                    Intent sendIntent = new Intent();
                    sendIntent.setAction(Intent.ACTION_SEND);
                    sendIntent.putExtra(Intent.EXTRA_TEXT,edText.getText().toString());
                    sendIntent.setType("text/plain");
                    startActivity(sendIntent);
            }
        });

    }

}
