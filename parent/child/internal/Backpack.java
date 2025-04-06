package parent.child.internal;

public class Backpack extends Bag {
    public Backpack() {
        System.out.println("Running no-arg constructor in Backpack");
    }
    @Override
    public void carryItems() {
        System.out.println("They is used to carry items");
    }

    public void materialType() {
        System.out.println("They is made of different materials");
    }

    public void size() {
        System.out.println("They comes in various sizes");
    }

    public void durability() {
        System.out.println("They has different durability levels");
    }

    public void compartments() {
        System.out.println("They has multiple compartments for storage");
    }
}
