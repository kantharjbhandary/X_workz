package parent.child.internal;

public class Appliance {
    public Appliance() {
        System.out.println("Running no-arg constructor in Appliance");
    }

    public void turnOn() {
        System.out.println("Appliance is turning on...");
    }

    public void turnOff() {
        System.out.println("Appliance is turning off...");
    }

    public void powerSource() {
        System.out.println("Appliance uses electricity or other power sources");
    }

    public void warranty() {
        System.out.println("Appliance comes with a standard warranty");
    }

    public void maintenance() {
        System.out.println("Appliance requires periodic maintenance");
    }
}
