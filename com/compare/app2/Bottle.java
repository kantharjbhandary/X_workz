package com.compare.app2;



public class Bottle {
    private String size;
    private String brand;
    private int quantity;

    public Bottle(String size, String brand, int quantity) {
        this.size = size;
        this.brand = brand;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Bottle) {
            Bottle bottle = this;
            Bottle bottle1 = (Bottle)obj;
            if (bottle.brand.equals(bottle1.brand) &&
                bottle.size.equals(bottle1.size) &&
                bottle.quantity == bottle1.quantity) {
                return true;
            }
        }
        return false;
    }

    
    @Override
    public String toString() {
        return "size : " + size + ", brand : " + brand + ", quantity : " + quantity;
    }
}
