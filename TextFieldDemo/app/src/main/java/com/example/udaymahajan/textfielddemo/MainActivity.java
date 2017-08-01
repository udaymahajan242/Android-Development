package com.example.udaymahajan.textfielddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void changeClicked(View view){

        ImageView img = (ImageView) findViewById(R.id.imageView);
        img.setImageResource(R.drawable.my_image2);

    }


    public void logInClicked(View view){

        EditText username = (EditText) findViewById(R.id.username);
        EditText password = (EditText) findViewById(R.id.password);
        Log.i("Username", username.getText().toString());
        Log.i("Password", password.getText().toString());
        Toast.makeText(MainActivity.this,"Hello "+ username.getText().toString(), Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
