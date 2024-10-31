package com.azka.bp_3_p2_20220810124;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Objects;

public class Process extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_process);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



        LinearLayout persegiView = findViewById(R.id.persegiView);
        persegiView.setVisibility(View.INVISIBLE);
        LinearLayout segitigaView = findViewById(R.id.segitigaView);
        segitigaView.setVisibility(View.INVISIBLE);
        LinearLayout persegiPanjangView = findViewById(R.id.persegiPanjangView);
        persegiPanjangView.setVisibility(View.INVISIBLE);

        Intent intent = getIntent();
        String type = intent.getStringExtra("type");

        // persegi
        EditText sisi1 = findViewById(R.id.sisi1);
        EditText sisi2 = findViewById(R.id.sisi2);
        // persegi panjang
        EditText panjang = findViewById(R.id.panjang);
        EditText lebar = findViewById(R.id.lebar);
        // segitiga
        EditText alas = findViewById(R.id.alas);
        EditText tinggi = findViewById(R.id.tinggi);
        //
        Button btnHasil = findViewById(R.id.btnHasil);
        TextView hasil = findViewById(R.id.hasil);

        btnHasil.setOnClickListener(v -> {
            if(type.equals("Persegi")){
                if(sisi1.getText().length() == 0 || sisi2.getText().length() == 0){
                    Toast.makeText(getApplicationContext(), "Di isi semua!", Toast.LENGTH_SHORT).show();
                }else{
                    int i = Integer.parseInt(sisi1.getText().toString()) * Integer.parseInt(sisi2.getText().toString());
                    hasil.setText(Integer.toString(i));
                }

            }else if(type.equals("Persegi Panjang")){
                if(panjang.getText().length() == 0 || lebar.getText().length() == 0){
                    Toast.makeText(getApplicationContext(), "Di isi semua!", Toast.LENGTH_SHORT).show();
                }else{
                    int i = Integer.parseInt(panjang.getText().toString()) * Integer.parseInt(lebar.getText().toString());
                    hasil.setText(Integer.toString(i));
                }
            }else if(type.equals("Segitiga")){
                if(alas.getText().length() == 0 || tinggi.getText().length() == 0){
                    Toast.makeText(getApplicationContext(), "Di isi semua!", Toast.LENGTH_SHORT).show();
                }else {
                    int i = Integer.parseInt(alas.getText().toString()) * Integer.parseInt(tinggi.getText().toString());
                    hasil.setText(Integer.toString(i));
                }
            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();
        TextView text = findViewById(R.id.title);
        LinearLayout persegiView = findViewById(R.id.persegiView);
        LinearLayout segitigaView = findViewById(R.id.segitigaView);
        LinearLayout persegiPanjangView = findViewById(R.id.persegiPanjangView);
        Intent intent = getIntent();
        String type = intent.getStringExtra("type");

        text.setText(type);
        if(Objects.equals(type, "Persegi")){
            persegiView.setVisibility(View.VISIBLE);
        }

        if(Objects.equals(type, "Persegi Panjang")){
            persegiPanjangView.setVisibility(View.VISIBLE);
        }

        if(Objects.equals(type, "Segitiga")){
            segitigaView.setVisibility(View.VISIBLE);
        }


    }
}