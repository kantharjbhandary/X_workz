package com.compare.app2;



public class Cushion {
    private String size;
    private String brand;
    private int quantity;

    public Cushion(String size, String brand, int quantity) {
        this.size = size;
        this.brand = brand;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Cushion) {
            Cushion cushion = this;
            Cushion cushion1 = (Cushion)obj;
            if (cushion.brand.equals(cushion1.brand) &&
                cushion.size.equals(cushion1.size) &&
                cushion.quantity == cushion1.quantity) {
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
