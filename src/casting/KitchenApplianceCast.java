package casting;

public class KitchenApplianceCast {
    public void cast(KitchenAppliance kitchenAppliance) {
        System.out.println("Casting KitchenAppliance");
        kitchenAppliance.cookFood();
        kitchenAppliance.clean();
        kitchenAppliance.safetyMeasures();
        kitchenAppliance.storage();
        kitchenAppliance.efficiency();
        if(kitchenAppliance instanceof KitchenApplianceDetails) {
            KitchenApplianceDetails ref = (KitchenApplianceDetails)kitchenAppliance;
            ref.extraMethod();
        }
    }
}
