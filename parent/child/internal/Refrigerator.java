package parent.child.internal;

public class Refrigerator extends Appliance {
    public Refrigerator() {
        System.out.println("Running no-arg constructor in Refrigerator");

    }
    @Override
    public void turnOn() {
        System.out.println(" turning on...");
    }

    public void turnOff() {
        System.out.println("turning off...");
    }

    public void powerSource() {
        System.out.println("it uses electricity or other power sources");
    }

    public void warranty() {
        System.out.println("they comes with a standard warranty");
    }

    public void maintenance() {
        System.out.println("Appliance ..requires periodic maintenance");
    }
}