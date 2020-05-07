package com.techDev.camapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Choose extends AppCompatActivity {


    private Spinner s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose);

    }

    public void opencat(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("testBool", false);
        startActivity(intent);



    }

    public void opendog(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);


    }
}
