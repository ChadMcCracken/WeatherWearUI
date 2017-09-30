package com.example.drewm.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void extendWeather(View view) {
        Intent intent = new Intent(this, ExtendedWeather.class);
        startActivity(intent);
    }

    public void extendClothing(View view) {
        Intent intent = new Intent(this, ClothingSuggestions.class);
        startActivity(intent);
    }
}
