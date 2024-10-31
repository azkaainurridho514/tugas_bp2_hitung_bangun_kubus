
package com.azka.bp_3_p2_20220810124;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button btnSegitiga = findViewById(R.id.btnSegitiga);
        Button btnPersegi = findViewById(R.id.btnPersegi);
        Button btnPersegiPanjang = findViewById(R.id.btnPersegiPanjang);

        btnSegitiga.setOnClickListener(view -> {
            Intent i = new Intent(this, Process.class);
            i.putExtra("type", "Segitiga");
            startActivity(i);
        });
        btnPersegi.setOnClickListener(view -> {
            Intent i = new Intent(this, Process.class);
            i.putExtra("type", "Persegi");
            startActivity(i);
        });
        btnPersegiPanjang.setOnClickListener(view -> {
            Intent i = new Intent(this, Process.class);
            i.putExtra("type", "Persegi Panjang");
            startActivity(i);
        });


    }
}
