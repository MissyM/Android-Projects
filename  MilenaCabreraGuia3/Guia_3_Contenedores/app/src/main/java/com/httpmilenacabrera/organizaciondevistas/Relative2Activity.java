package com.httpmilenacabrera.organizaciondevistas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Relative2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative2);
    }
    public void goTable(View view){
        Intent intent = new Intent(this,TableActivity.class);
        startActivity(intent);
    }
}
