package com.comparison.app;



public class Mop {
    private String name;
    private int size;

    public Mop(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Mop) {
            Mop mop = this;
            Mop mop1 = (Mop) obj;
            if (mop.name.equals(mop1.name) &&
                mop.size == mop1.size) {
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
