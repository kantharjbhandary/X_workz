package com.access.control.country;

public class Country {
    Primeminister pm;
    String name="India";
    public Country()
    {
        this.pm=new Primeminister();
        System.out.println("Country has an PrimeMinister");
    }
    public void display()
    {
        System.out.println("The country is "+name);
        pm.display();
    }

}
