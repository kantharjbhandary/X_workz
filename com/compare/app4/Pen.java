package com.compare.app4;



public class Pen {
    private String brand;

    public Pen(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Pen) {
            Pen pen = this;
            Pen pen1 = (Pen) obj;
            if (pen.brand.equals(pen1.brand)) {
                return true;
            }
        }
        return false;
    }

    
    @Override
    public String toString() {
        return "brand : " + brand;
    }
}
