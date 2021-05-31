package com.example.memory;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity2);
        TextView textView = findViewById(R.id.textView2);
        textView.setText(getIntent().getStringExtra("text"));
    }}
