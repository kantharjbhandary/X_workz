package casting;

public class KitchenApplianceDetails extends KitchenAppliance {
    @Override
    public void cookFood() {
        System.out.println("Overridden: cookFood in KitchenApplianceDetails");
    }

    @Override
    public void clean() {
        System.out.println("Overridden: clean in KitchenApplianceDetails");
    }

    @Override
    public void safetyMeasures() {
        System.out.println("Overridden: safetyMeasures in KitchenApplianceDetails");
    }

    @Override
    public void storage() {
        System.out.println("Overridden: storage in KitchenApplianceDetails");
    }

    @Override
    public void efficiency() {
        System.out.println("Overridden: efficiency in KitchenApplianceDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in KitchenApplianceDetails");
    }
}
