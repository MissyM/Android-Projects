package com.httpmilenacabrera.guia1_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import static android.R.attr.button;
import static android.R.attr.onClick;

public class VentasActivity extends AppCompatActivity {

    RadioGroup rg;
    TextView txtSubtotal, txtDcto, txtTotal;
    CheckBox cbDescuento;
    Button btnCalcular;
    int subtotal = 1000000;
    int descuento = 200000;
    boolean isChecked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventas);

        rg = (RadioGroup) findViewById(R.id.rgOpciones);//Llamo al elemento radio group
        txtSubtotal = (TextView) findViewById(R.id.txtSubtotal);
        cbDescuento = (CheckBox) findViewById(R.id.cbDcto);
        txtDcto = (TextView)findViewById(R.id.TxtDcto);
        btnCalcular = (Button)findViewById(R.id.btnCalcular);
        txtTotal = (TextView)findViewById(R.id.TxtTotal);


        //Accedo al método setOnClickedChangeListener()
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rbUno:
                        txtSubtotal.setText(R.string.tv);
                        break;
                    case R.id.rbDos:
                        txtSubtotal.setText(R.string.rad);
                        break;
                }
                subtotal = Integer.parseInt(txtSubtotal.getText().toString());
                descuento = (int) (subtotal*0.20);
                if (isChecked) {
                    txtDcto.setText(Integer.toString(descuento));
                }

            }
        });

        cbDescuento.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener(){


            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isCheck) {
                isChecked = isCheck;
                if (isCheck) {
                    txtDcto.setText(Integer.toString(descuento));

                } else {
                    txtDcto.setText("");
                }

            }
        });

        btnCalcular.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                int op1 = subtotal - descuento;
               txtTotal.setText(String.valueOf(op1));
            }
        });

    }
}


