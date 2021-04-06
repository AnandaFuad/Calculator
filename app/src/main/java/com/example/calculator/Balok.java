package com.example.calculator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Balok extends Fragment {
    private EditText txt_panjang, txt_lebar, txt_tinggi;
    private Button btnhasil;
    private TextView hasil;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_balok, container, false);

        txt_panjang = v.findViewById(R.id.txt_panjang);
        txt_lebar = v.findViewById(R.id.txt_lebar);
        txt_tinggi = v.findViewById(R.id.txt_tinggi);
        btnhasil = v.findViewById(R.id.btnhasil);
        hasil = v.findViewById(R.id.hasil);

        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilai1 = txt_panjang.getText().toString();
                String nilai2 = txt_lebar.getText().toString();
                String nilai3 = txt_tinggi.getText().toString();

                Integer panjang = Integer.parseInt(nilai1);
                Integer lebar = Integer.parseInt(nilai2);
                Integer tinggi = Integer.parseInt(nilai3);
                Integer volume = panjang * lebar * tinggi;
                hasil.setText(String.valueOf(volume));
            }
        });

        return v;
    }
}