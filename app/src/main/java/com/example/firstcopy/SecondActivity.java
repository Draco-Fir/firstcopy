package com.example.firstcopy;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        ImageView biggoal = findViewById(R.id.imageView);
        ImageView firoption = findViewById(R.id.imageView1);
        ImageView secoption = findViewById(R.id.imageView2);
        ImageView thiroption = findViewById(R.id.imageView3);
        biggoal.setOnClickListener(v -> {
            Toast.makeText(this, "big goal", Toast.LENGTH_SHORT).show();
        });
        firoption.setOnClickListener(v -> {
            Toast.makeText(this, "first option", Toast.LENGTH_SHORT).show();
        });
        secoption.setOnClickListener(v -> {
            Toast.makeText(this, "second option", Toast.LENGTH_SHORT).show();
        });
        thiroption.setOnClickListener(v -> {
            Toast.makeText(this, "third option", Toast.LENGTH_SHORT).show();
        });
    }
}