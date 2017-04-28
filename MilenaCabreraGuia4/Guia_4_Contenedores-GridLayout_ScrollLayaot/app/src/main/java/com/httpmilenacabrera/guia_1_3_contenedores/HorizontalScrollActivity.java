package com.httpmilenacabrera.guia_1_3_contenedores;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HorizontalScrollActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal_scroll);
    }
    public void next(View view){
        Intent intent = new Intent(this,GridLayoutActivity.class);
        startActivity(intent);
    }
}
