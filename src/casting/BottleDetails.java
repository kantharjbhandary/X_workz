package casting;

public class BottleDetails extends Bottle {
    @Override
    public void material() {
        System.out.println("Overridden: material in BottleDetails");
    }

    @Override
    public void capacity() {
        System.out.println("Overridden: capacity in BottleDetails");
    }

    @Override
    public void usage() {
        System.out.println("Overridden: usage in BottleDetails");
    }

    @Override
    public void brands() {
        System.out.println("Overridden: brands in BottleDetails");
    }

    @Override
    public void design() {
        System.out.println("Overridden: design in BottleDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in BottleDetails");
    }
}
