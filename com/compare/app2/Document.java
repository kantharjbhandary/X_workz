package com.compare.app2;



public class Document {
    private String size;
    private String brand;
    private int quantity;

    public Document(String size, String brand, int quantity) {
        this.size = size;
        this.brand = brand;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Document) {
            Document document = this;
            Document document1 = (Document)obj;
            if (document.brand.equals(document1.brand) &&
                document.size.equals(document1.size) &&
                document.quantity == document1.quantity) {
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
