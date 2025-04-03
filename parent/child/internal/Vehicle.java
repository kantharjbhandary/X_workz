package parent.child.internal;

public class Vehicle {
    public Vehicle() {
        System.out.println("Running no-arg constructor in Vehicle");
    }

    public void startEngine() {
        System.out.println("Vehicle engine is starting...");
    }

    public void stopEngine() {
        System.out.println("Vehicle engine is stopping...");
    }

    public void fuelType() {
        System.out.println("Vehicle uses different types of fuel");
    }

    public void speedLimit() {
        System.out.println("Vehicle has different speed limits depending on the type");
    }

    public void capacity() {
        System.out.println("Vehicle has varying passenger and cargo capacity");
    }
}

