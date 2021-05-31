package com.example.memory;

import android.app.Application;
import android.content.Context;

public class Memory extends Application {

    private static Context context;

    public void onCreate() {
        super.onCreate();
        Memory.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return Memory.context;
    }}