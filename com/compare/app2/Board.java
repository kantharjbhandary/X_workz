package com.compare.app2;



public class Board {
    private String size;
    private String brand;
    private int quantity;

    public Board(String size, String brand, int quantity) {
        this.size = size;
        this.brand = brand;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Board) {
            Board board = this;
            Board board1 = (Board)obj;
            if (board.brand.equals(board1.brand) &&
                board.size.equals(board1.size) &&
                board.quantity == board1.quantity) {
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
