package com.access.control.geography;

public class Ward {
    private String name;
    City city;

    public Ward(String name) {
        this.name = name;
        this.city=new City("Rajajinagara");
    }

    public void display() {
        System.out.println("Ward: " + name);
        city.display();
    }
}