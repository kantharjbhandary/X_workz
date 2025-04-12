package com.compare.app2;



public class Curtain {
    private String size;
    private String brand;
    private int quantity;

    public Curtain(String size, String brand, int quantity) {
        this.size = size;
        this.brand = brand;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Curtain) {
            Curtain curtain = this;
            Curtain curtain1 = (Curtain)obj;
            if (curtain.brand.equals(curtain1.brand) &&
                curtain.size.equals(curtain1.size) &&
                curtain.quantity == curtain1.quantity) {
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
