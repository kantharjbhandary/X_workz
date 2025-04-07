package parent.child.internal;
public class Bonfire extends Campfire {
    public Bonfire() {
        System.out.println("Running no-arg constructor in Bonfire");
    }
    public void fuelType() { System.out.println("Campfires use wood burned,"); }
    public void purpose() { System.out.println("Campfires are used to burn"); }
    public void safety() { System.out.println("saftey is important"); }
    public void duration() { System.out.println("Campfires take lot of duration"); }
    public void location() { System.out.println("Campfires are set up at different loactions"); }
    public void firing(){
        System.out.println("running fire in bonfire");
    }

}

