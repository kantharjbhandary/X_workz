package com.compare.app4;



public class Pan {
    private int diameter;

    public Pan(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Pan) {
            Pan pan = this;
            Pan pan1 = (Pan) obj;
            if (pan.diameter == pan1.diameter) {
                return true;
            }
        }
        return false;
    }

    
    @Override
    public String toString() {
        return "diameter : " + diameter;
    }
}
