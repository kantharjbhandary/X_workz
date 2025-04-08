package casting;

public class KitchenApplianceRunner {
    public static void main(String[] args) {

        KitchenAppliance kitchenAppliance = new KitchenAppliance();
        kitchenAppliance.cookFood();
        kitchenAppliance.clean();
        kitchenAppliance.safetyMeasures();
        kitchenAppliance.storage();
        kitchenAppliance.efficiency();
        System.out.println("----------------------");

        KitchenAppliance kitchenAppliancePoly = new KitchenApplianceDetails();
        kitchenAppliancePoly.cookFood();
        kitchenAppliancePoly.clean();
        kitchenAppliancePoly.safetyMeasures();
        kitchenAppliancePoly.storage();
        kitchenAppliancePoly.efficiency();
        System.out.println("----------------------");

        KitchenApplianceDetails kitchenApplianceDetails = new KitchenApplianceDetails();
        kitchenApplianceDetails.cookFood();
        kitchenApplianceDetails.clean();
        kitchenApplianceDetails.safetyMeasures();
        kitchenApplianceDetails.storage();
        kitchenApplianceDetails.efficiency();
        kitchenApplianceDetails.extraMethod();
        System.out.println("----------------------");

        KitchenApplianceCast kitchenApplianceCast = new KitchenApplianceCast();
        kitchenApplianceCast.cast(kitchenAppliancePoly);
    }
}
