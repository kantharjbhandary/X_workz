package com.app.clear;

public class Speed {
    void speedShow()
    {
        System.out.println("This method has the total speed");
        Rocket rocket=new Rocket();
        Speed speed=new Speed();
        rocket.rocketSpeed(speed);

    }
    void runSpeed()
    {
        System.out.println("The speed is 500km/h");
    }


}
