package com.access.control.geography;


public class District {
    private String name;
    private Ward[] wards;

    public District(String name) {
        this.name = name;
        this.wards = new Ward[]{new Ward("Nelamangala Ward")};
    }

    public void display() {
        System.out.println("District: " + name);
        for (Ward ward : wards) {
            ward.display();
        }
    }
}
