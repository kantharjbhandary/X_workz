package com.access.control.work;
//import java.awt.*;

public class Company {

    public String companyName;
    Education education;
    Experience experience;
    public Company(String companyName){
        this.companyName=companyName;
        this.education=new Education("B.E");
        this.experience=new Experience("Fresher");
    }
    public void display(){
        System.out.println("Company name is : "+companyName);
        education.display();
        experience.display();
    }
}
