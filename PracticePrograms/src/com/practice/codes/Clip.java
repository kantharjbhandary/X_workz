package com.march.thu20;

public class Clip {
    String color;
    Clip(String color)
    {
        this.color=color;
    }
    public void hold()
    {
        System.out.println("Holding clip of color :"+this.color);
    }

}
