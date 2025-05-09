package com.comparison.app;



public class Keyboard {
    private String name;
    private int size;

    public Keyboard(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Keyboard) {
            Keyboard keyboard = this;
            Keyboard keyboard1 = (Keyboard) obj;
            if (keyboard.name.equals(keyboard1.name) &&
                keyboard.size == keyboard1.size) {
                return true;
            }
        }
        return false;
    }

    
    @Override
    public String toString() {
        return "name : " + name + ", size : " + size;
    }
}
