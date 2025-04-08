package casting;

public class WatchDetails extends Watch {
    @Override
    public void brand() {
        System.out.println("Overridden: brand in WatchDetails");
    }

    @Override
    public void type() {
        System.out.println("Overridden: type in WatchDetails");
    }

    @Override
    public void material() {
        System.out.println("Overridden: material in WatchDetails");
    }

    @Override
    public void waterproof() {
        System.out.println("Overridden: waterproof in WatchDetails");
    }

    @Override
    public void priceRange() {
        System.out.println("Overridden: priceRange in WatchDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in WatchDetails");
    }
}
