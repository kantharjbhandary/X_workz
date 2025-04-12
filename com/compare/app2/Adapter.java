package com.compare.app2;



public class Adapter {
    private String size;
    private String brand;
    private int quantity;

    public Adapter(String size, String brand, int quantity) {
        this.size = size;
        this.brand = brand;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Adapter) {
            Adapter adapter = this;
            Adapter adapter1 = (Adapter)obj;
            if (adapter.brand.equals(adapter1.brand) &&
                adapter.size.equals(adapter1.size) &&
                adapter.quantity == adapter1.quantity) {
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
