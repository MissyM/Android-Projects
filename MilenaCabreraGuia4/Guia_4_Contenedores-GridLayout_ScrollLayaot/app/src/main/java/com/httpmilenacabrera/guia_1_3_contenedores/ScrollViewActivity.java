package com.httpmilenacabrera.guia_1_3_contenedores;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ScrollViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);
    }

    public void goGokus(View view) {
        Intent intent = new Intent(this,HorizontalScrollActivity.class);
        startActivity(intent);
    }

}
