package com.example.firstcopy;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.Gravity;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.os.Handler;
import com.example.firstcopy.R;
import com.example.firstcopy.MainActivity;
public class SecondActivity extends AppCompatActivity {
    private static final long DOUBLE_CLICK_TIME_DELTA = 300; // milliseconds
    long lastClickTime = 0;
    private static final long timedelay = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        ImageView biggoal = findViewById(R.id.imageView);
        ImageView firoption = findViewById(R.id.imageView1);
        ImageView secoption = findViewById(R.id.imageView2);
        ImageView thiroption = findViewById(R.id.imageView3);

        lastClickTime = System.currentTimeMillis();
        biggoal.setOnClickListener(v -> {
            //uses to subtract time to figure out if double lick is active
            long clickTime = System.currentTimeMillis();
            if (clickTime - lastClickTime < DOUBLE_CLICK_TIME_DELTA) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), String.valueOf(clickTime - lastClickTime> System.currentTimeMillis() - timedelay) , Toast.LENGTH_SHORT).show();
            }
            lastClickTime = clickTime;

        });
        lastClickTime = System.currentTimeMillis();
        firoption.setOnClickListener(v -> {
            long clickTime = System.currentTimeMillis();
            if (clickTime - lastClickTime < DOUBLE_CLICK_TIME_DELTA) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), String.valueOf(clickTime - lastClickTime> System.currentTimeMillis() - timedelay) , Toast.LENGTH_SHORT).show();
            }
            lastClickTime = clickTime;
        });
        lastClickTime = System.currentTimeMillis();
        secoption.setOnClickListener(v -> {
            long clickTime = System.currentTimeMillis();
            if (clickTime - lastClickTime < DOUBLE_CLICK_TIME_DELTA) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), String.valueOf(clickTime - lastClickTime> System.currentTimeMillis() - timedelay) , Toast.LENGTH_SHORT).show();
            }
            lastClickTime = clickTime;
        });
        lastClickTime = System.currentTimeMillis();
        thiroption.setOnClickListener(v -> {
            long clickTime = System.currentTimeMillis();
            if (clickTime - lastClickTime < DOUBLE_CLICK_TIME_DELTA) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), String.valueOf(clickTime - lastClickTime> System.currentTimeMillis() - timedelay) , Toast.LENGTH_SHORT).show();
            }
            lastClickTime = clickTime;
        });
    }

}
