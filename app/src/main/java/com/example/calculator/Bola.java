package com.example.calculator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bola extends Fragment {
    private Button btnhasil;
    private EditText txt_jari2;
    private TextView hasil;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_bola, container, false);

        txt_jari2 = v.findViewById(R.id.txt_jari2);
        btnhasil = v.findViewById(R.id.btnhasil);
        hasil = v.findViewById(R.id.hasil);

        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilai1 = txt_jari2.getText().toString();

                Double jari = Double.parseDouble(nilai1);
                Double volume = (4 / 3) * 3.14 * jari * jari *jari;
                hasil.setText(String.format("%.2f", volume));
            }
        });

        return v;
    }
}