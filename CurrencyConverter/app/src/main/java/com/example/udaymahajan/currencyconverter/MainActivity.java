package com.example.udaymahajan.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){

        EditText dollarAmount = (EditText) findViewById(R.id.dollarAmount);
        Double dollarAmountDouble = Double.parseDouble(dollarAmount.getText().toString());
        Double rupeeAmount = dollarAmountDouble * 64.58;
        Toast.makeText(MainActivity.this, "" + String.format("%.2f", rupeeAmount), Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
