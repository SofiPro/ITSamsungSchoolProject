package com.example.memory;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import java.io.Serializable;
import java.util.HashMap;

public class Story implements Serializable {
    HashMap<String, Situation> hashMap = new HashMap<>();
    private Situation start_story;
    public Situation current_situation;

    Story(Context context) {
//        hashMap.put("awake", new Situation(2,context.getResources().getString(R.string.awake)));
//        hashMap.put("ask", new Situation(2,context.getResources().getString(R.string.ask)));
//        hashMap.put("go", new Situation(2, context.getResources().getString(R.string.go)));
//        hashMap.put("tooCold", new Situation(0, context.getResources().getString(R.string.tooCold)));
//        hashMap.put("runAway", new Situation(0, context.getResources().getString(R.string.runAway)));
//        hashMap.put("memoryReturns", new Situation(0,context.getResources().getString(R.string.memoryReturns)));
//        hashMap.put("madhouse", new Situation(2, context.getResources().getString(R.string.madhouse)));
//        hashMap.put("experiment", new Situation(0, context.getResources().getString(R.string.experiement)));
//        hashMap.put("madhouseForever", new Situation(0, context.getResources().getString(R.string.madhouseForever)));
//        hashMap.put("goodHospital", new Situation(2, context.getResources().getString(R.string.goodHospital)));
//        hashMap.put("lookForFamily", new Situation(0, context.getResources().getString(R.string.lookForFamily)));
//        hashMap.put("adopted", new Situation(0, context.getResources().getString(R.string.adopted)));
//        hashMap.put("badHospital", new Situation(2, context.getResources().getString(R.string.badHospital)));
//        start_story = hashMap.get("awake");
//        start_story.direction[0] = hashMap.get("go");
//        start_story.direction[1] = hashMap.get("ask");
//        start_story.direction[0].direction[0] = hashMap.get("tooCold");
//        start_story.direction[0].direction[1] = hashMap.get("badHospital");
//        start_story.direction[0].direction[1].direction[0] = hashMap.get("runAway");
//        start_story.direction[0].direction[1].direction[1] = hashMap.get("memoryReturns");
//        start_story.direction[1].direction[0] = hashMap.get("goodHospital");
//        start_story.direction[1].direction[1] = hashMap.get("madhouse");
//        start_story.direction[1].direction[0].direction[0] = hashMap.get("lookForFamily");
//        start_story.direction[1].direction[0].direction[1] = hashMap.get("adopted");
//        start_story.direction[1].direction[1].direction[0] = hashMap.get("experiment");
//        start_story.direction[1].direction[1].direction[1] = hashMap.get("madhouseForever");
        Situation adopted = new Situation(0, context.getResources().getString(R.string.adopted), null, null);
        Situation lookForFamiy = new Situation(0, context.getResources().getString(R.string.lookForFamily), null, null);
        Situation goodHospital = new Situation(2, context.getResources().getString(R.string.goodHospital), lookForFamiy, adopted);
        Situation madhouseForever = new Situation(0, context.getResources().getString(R.string.madhouseForever), null, null);
        Situation experiment = new Situation(0, context.getResources().getString(R.string.experiement), null, null);
        Situation madhouse = new Situation(2, context.getResources().getString(R.string.madhouse), experiment, madhouseForever);
        Situation memoryReturns = new Situation(0, context.getResources().getString(R.string.memoryReturns), null, null);
        Situation runAway = new Situation(0, context.getResources().getString(R.string.runAway), null, null);
        Situation tooCold = new Situation(0, context.getResources().getString(R.string.tooCold), null, null);
        Situation badHospital = new Situation(2, context.getResources().getString(R.string.badHospital), runAway, memoryReturns);
        Situation go = new Situation(2, context.getResources().getString(R.string.go), tooCold, badHospital);
        Situation ask = new Situation(2, context.getResources().getString(R.string.ask), madhouse, goodHospital);
        Situation awake = new Situation(2, context.getResources().getString(R.string.awake), go, ask);
        start_story = awake;
        current_situation = start_story;
    }

    public void go(int num) {
        if (!isEnd()) {
            if (num == 0) current_situation = current_situation.situation1;
            else current_situation = current_situation.situation2;
        }
    }

    public boolean isEnd() {
        return current_situation.direction == 0;
    }
}
