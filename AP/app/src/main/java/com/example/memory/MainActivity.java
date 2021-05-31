package com.example.memory;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context = Memory.getAppContext();
        //ActionBar actionBar = this.getActionBar();
        //actionBar.hide();
        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        TextView textView = findViewById(R.id.textView);
        Story story = (Story) getIntent().getSerializableExtra("story");
        textView.setText(story.current_situation.text);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                story.go(0);
                if (story.isEnd()) {
                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    i.putExtra("text", story.current_situation.text);
                    startActivity(i);
                } else textView.setText(story.current_situation.text);
            }
        };
        View.OnClickListener listener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                story.go(1);
                if (story.isEnd()) {
                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    i.putExtra("text", story.current_situation.text);
                    startActivity(i);
                } else textView.setText(story.current_situation.text);
            }
        };
        button.setOnClickListener(listener);
        button2.setOnClickListener(listener2);

    }
}