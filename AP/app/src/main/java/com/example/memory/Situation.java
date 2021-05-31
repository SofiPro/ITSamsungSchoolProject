package com.example.memory;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;

import java.io.Serializable;

public class Situation implements Serializable {
    //Situation[] direction;
    int direction;
    String text;
   // Drawable drawable;
    final Situation situation1;
    final Situation situation2;
    public Situation (int variants, String textFromRes, Situation situation1, Situation situation2) {
        this.text = textFromRes;
        direction=variants;
        this.situation1= situation1;
        this.situation2=situation2;
    }
}
