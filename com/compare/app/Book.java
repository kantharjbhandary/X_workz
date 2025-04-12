package com.compare.app;

import java.util.Objects;

public class Book {
    private String size;
    private String brand;
    private int quantity;

    public Book(String size, String brand, int quantity) {
        this.size = size;
        this.brand = brand;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Book) {
            Book book = this;
            Book book1 = (Book)obj;
            if (book.brand.equals(book1.brand) &&
                book.size.equals(book1.size) &&
                book.quantity == book1.quantity) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, brand, quantity);
    }

    @Override
    public String toString() {
        return "size : " + size + ", brand : " + brand + ", quantity : " + quantity;
    }
}
