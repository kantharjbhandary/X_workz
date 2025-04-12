package com.compare.app2;



public class Brush {
    private String size;
    private String brand;
    private int quantity;

    public Brush(String size, String brand, int quantity) {
        this.size = size;
        this.brand = brand;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Brush) {
            Brush brush = this;
            Brush brush1 = (Brush)obj;
            if (brush.brand.equals(brush1.brand) &&
                brush.size.equals(brush1.size) &&
                brush.quantity == brush1.quantity) {
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
