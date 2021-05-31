package com.example.memory;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);
        Button button = findViewById(R.id.startbutton);
        Story story = new Story(Memory.getAppContext());
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(StartActivity.this, MainActivity.class);
                i.putExtra("story", story);
                startActivity(i);
            }
        };
        button.setOnClickListener(listener);
}}
