package com.compare.app2;



public class Basket {
    private String size;
    private String brand;
    private int quantity;

    public Basket(String size, String brand, int quantity) {
        this.size = size;
        this.brand = brand;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Basket) {
            Basket basket = this;
            Basket basket1 = (Basket)obj;
            if (basket.brand.equals(basket1.brand) &&
                basket.size.equals(basket1.size) &&
                basket.quantity == basket1.quantity) {
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
