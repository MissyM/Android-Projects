package com.httpmilenacabrera.organizaciondevistas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LinearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
    }
    public void goRelative(View view){
        Intent intent = new Intent(this,Relative2Activity.class);
        startActivity(intent);
    }
}
