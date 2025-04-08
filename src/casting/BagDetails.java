package casting;

public class BagDetails extends Bag {
    @Override
    public void carryItems() {
        System.out.println("Overridden: carryItems in BagDetails");
    }

    @Override
    public void materialType() {
        System.out.println("Overridden: materialType in BagDetails");
    }

    @Override
    public void size() {
        System.out.println("Overridden: size in BagDetails");
    }

    @Override
    public void durability() {
        System.out.println("Overridden: durability in BagDetails");
    }

    @Override
    public void compartments() {
        System.out.println("Overridden: compartments in BagDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in BagDetails");
    }
}
