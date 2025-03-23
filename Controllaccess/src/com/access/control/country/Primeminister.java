package com.access.control.country;

import com.access.control.government.Minister;

public class Primeminister {
   public Minister[] minister;
    String name="Modi";
    public  Primeminister()
    {
        minister=new Minister[]{new Minister("Siddaramaiah")};
    }
    public void display()
    {
        System.out.println("Prime minister of india :"+name);
        for(Minister M: minister)
        {
            M.display();
        }
    }
}
