package com.xworkz.practice;

public class Bag {
    public String brand;
    private int cost;
    int noOfZips;


    public Bag()
    {
       this.brand="Adidas";
       this.cost=999;
       this.noOfZips=5;
    }
    public void displayBrand()
    {
        System.out.println("Running brand"+brand);

    }
    private void displayCost()
    {
        System.out.println("Running cost"+cost);
    }
    void displayNoOfZip()
    {
        System.out.println("Running zip"+noOfZips);
    }
}
