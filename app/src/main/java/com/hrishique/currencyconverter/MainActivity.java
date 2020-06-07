package com.hrishique.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText amount;
    TextView result;
    Button dollar,euro,pound,aus,canada,yen,dinar,bitty,rubel,clear;
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amount=findViewById(R.id.amount);
        result=findViewById(R.id.result);
        dollar=findViewById(R.id.dollar);
        euro=findViewById(R.id.euro);
        pound=findViewById(R.id.pound);
        aus=findViewById(R.id.aus);
        canada=findViewById(R.id.canada);
        yen=findViewById(R.id.yen);
        dinar=findViewById(R.id.dinar);
        bitty=findViewById(R.id.bitty);
        rubel=findViewById(R.id.rubel);
        clear=findViewById(R.id.clear);

        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value=amount.getText().toString();
                result.setText(String.valueOf(Integer.parseInt(value)*20));
            }

        });
        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value=amount.getText().toString();
                result.setText(String.valueOf(Integer.parseInt(value)*30));
            }
        });
        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value=amount.getText().toString();
                result.setText(String.valueOf(Integer.parseInt(value)*40));
            }
        });
        aus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value=amount.getText().toString();
                result.setText(String.valueOf(Integer.parseInt(value)*50));
            }
        });
        canada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value=amount.getText().toString();
                result.setText(String.valueOf(Integer.parseInt(value)*60));
            }
        });
        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value=amount.getText().toString();
                result.setText(String.valueOf(Integer.parseInt(value)*70));
            }
        });
        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value=amount.getText().toString();
                result.setText(String.valueOf(Integer.parseInt(value)*80));
            }
        });
        bitty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value=amount.getText().toString();
                result.setText(String.valueOf(Integer.parseInt(value)*90));
            }
        });
        rubel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value=amount.getText().toString();
                result.setText(String.valueOf(Integer.parseInt(value)*100));
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amount.setText("");
                result.setText("");
            }
        });


    }
}
