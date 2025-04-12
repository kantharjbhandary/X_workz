package com.compare.app2;



public class Bucket {
    private String size;
    private String brand;
    private int quantity;

    public Bucket(String size, String brand, int quantity) {
        this.size = size;
        this.brand = brand;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Bucket) {
            Bucket bucket = this;
            Bucket bucket1 = (Bucket)obj;
            if (bucket.brand.equals(bucket1.brand) &&
                bucket.size.equals(bucket1.size) &&
                bucket.quantity == bucket1.quantity) {
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
