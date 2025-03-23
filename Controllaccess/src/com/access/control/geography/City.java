package com.access.control.geography;

import com.access.control.work.Company;

public class City {
    private String cityName;
    Company company;
    public City(String cityName)
    {
        this.cityName=cityName;
        this.company=new Company("X-workz");
    }
    public void display(){
        System.out.println("this is a city called : "+cityName);
        company.display();
    }
}