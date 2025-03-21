package com.march.thu20;

public class PushpaRunner {
    public static void main(String[] args) {


        Clip[] clips = new Clip[5];
        clips[0]=new Clip("Red");
        clips[1]=new Clip("Blue");
        clips[2]=new Clip("Yellow");
        clips[3]=new Clip("Pink");
        clips[4]=new Clip("Viloet");
        Pushpa pushpa = new Pushpa();
        pushpa.useClip(clips);
    }
}