package com.compare.app2;



public class Charger {
    private String size;
    private String brand;
    private int quantity;

    public Charger(String size, String brand, int quantity) {
        this.size = size;
        this.brand = brand;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Charger) {
            Charger charger = this;
            Charger charger1 = (Charger)obj;
            if (charger.brand.equals(charger1.brand) &&
                charger.size.equals(charger1.size) &&
                charger.quantity == charger1.quantity) {
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
