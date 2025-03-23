package com.access.control.administration;


public class Room {
    private String type;

    public Room(String type) {
        this.type = type;
    }

    public void display() {
        System.out.println("Room: " + type);
    }
}