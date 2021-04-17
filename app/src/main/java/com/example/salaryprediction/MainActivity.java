 package com.example.salaryprediction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button startButton, endButton;

    public void enterApp(View view)
    {
        Intent intent=new Intent(getApplicationContext(),WebActivity.class);
        startActivity(intent);
    }

    public void exitApp(View view)
    {
        Toast.makeText(this,"Thank you! Visit Again",Toast.LENGTH_LONG).show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
                System.exit(0);
            }
        }, 1000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = findViewById(R.id.startButton);
        endButton = findViewById(R.id.endButton);

    }
}