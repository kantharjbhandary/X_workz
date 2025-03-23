package com.access.control.work;

public class Experience {
    String years;
    ExperienceDetail experienceDetail;
    public Experience(String years){
        this.years=years;
        this.experienceDetail=new ExperienceDetail();
    }
    public void display(){
        System.out.println("Experience required is : "+years);
        experienceDetail.dispay();
    }
}