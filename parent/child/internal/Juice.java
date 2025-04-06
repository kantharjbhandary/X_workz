package parent.child.internal;

public class Juice extends Beverage {
    public Juice() {
        System.out.println("Running no-arg constructor in Juice");
    }
    @Override
    public void temperature() { System.out.println("They can be hot or cold"); }
    public void flavor() { System.out.println("They come in different flavors"); }
    public void ingredients() { System.out.println("They are made from various ingredients"); }
    public void packaging() { System.out.println("They have different packaging types"); }
    public void brand() { System.out.println("They come from different brands"); }
}