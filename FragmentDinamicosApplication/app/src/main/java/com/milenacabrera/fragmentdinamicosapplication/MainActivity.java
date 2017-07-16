package com.milenacabrera.fragmentdinamicosapplication;

import android.net.Uri;
import android.os.TransactionTooLargeException;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, BlankFragment.OnFragmentInteractionListener,PinkFragment.OnFragmentInteractionListener, YellowFragment.OnFragmentInteractionListener  {
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    BlankFragment blankFragment;
    PinkFragment pinkFragment;
    YellowFragment yellowFragment;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button btn1 = (Button)findViewById(R.id.btn1);
        Button btn2 = (Button)findViewById(R.id.btn2);
        Button btn3 = (Button)findViewById(R.id.btn3);

    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn1:
                initFragment();
                fragmentTransaction.replace(R.id.frame, blankFragment);
                break;
            case R.id.btn2:
                initFragment();
                fragmentTransaction.replace(R.id.frame, pinkFragment);
                break;
            case R.id.btn3:
                initFragment();
                fragmentTransaction.replace(R.id.frame, yellowFragment);
        }
    }

    private void initFragment() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}

