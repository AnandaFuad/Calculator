package com.example.calculator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kubus extends Fragment {
    private Button btnhasil;
    private EditText txt_sisi;
    private TextView hasil;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_kubus, container, false);

        btnhasil = v.findViewById(R.id.btnhasil);
        txt_sisi = v.findViewById(R.id.txt_sisi);
        hasil = v.findViewById(R.id.hasil);

        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilai1 = txt_sisi.getText().toString();

                Integer sisi = Integer.parseInt(nilai1);
                Integer volume = sisi * sisi * sisi;
                hasil.setText(String.valueOf(volume));
            }
        });

        return v;
    }
}