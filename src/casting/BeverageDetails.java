package casting;

public class BeverageDetails extends Beverage {
    @Override
    public void temperature() {
        System.out.println("Overridden: temperature in BeverageDetails");
    }

    @Override
    public void flavor() {
        System.out.println("Overridden: flavor in BeverageDetails");
    }

    @Override
    public void ingredients() {
        System.out.println("Overridden: ingredients in BeverageDetails");
    }

    @Override
    public void packaging() {
        System.out.println("Overridden: packaging in BeverageDetails");
    }

    @Override
    public void brand() {
        System.out.println("Overridden: brand in BeverageDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in BeverageDetails");
    }
}
