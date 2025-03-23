package com.access.control.government;


public class Skill {
    private String type;

    public Skill(String type) {
        this.type = type;
    }

    public void display() {
        System.out.println("Skill: " + type);
    }
}