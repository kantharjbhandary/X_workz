package com.access.control.work;

import com.access.control.government.Skill;
public class Education {
    String degree;
    Skill skill;

    public Education(String degree){
        this.degree=degree;
        this.skill=new Skill("Software Development");
    }
    public void display(){
        System.out.println("Education required is : "+degree);
        skill.display();

    }
}