package com.compare.app2;



public class Bracelet {
    private String size;
    private String brand;
    private int quantity;

    public Bracelet(String size, String brand, int quantity) {
        this.size = size;
        this.brand = brand;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Bracelet) {
            Bracelet bracelet = this;
            Bracelet bracelet1 = (Bracelet)obj;
            if (bracelet.brand.equals(bracelet1.brand) &&
                bracelet.size.equals(bracelet1.size) &&
                bracelet.quantity == bracelet1.quantity) {
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
