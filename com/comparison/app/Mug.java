package com.comparison.app;



public class Mug {
    private String name;
    private int size;

    public Mug(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Mug) {
            Mug mug = this;
            Mug mug1 = (Mug) obj;
            if (mug.name.equals(mug1.name) &&
                mug.size == mug1.size) {
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
