package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fragmentkubus(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Kubus()).commit();
    }

    public void fragmentbalok(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Balok()).commit();
    }

    public void fragmentbola(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Bola()).commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Kubus()).commit();
    }
}