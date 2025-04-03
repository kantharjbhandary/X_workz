package parent.child.external;

import parent.child.internal.KitchenAppliance;
import parent.child.internal.Microwave;

public class KitchenApllianceRunner {
           public static void main(String[] args) {
            KitchenAppliance appliance = new KitchenAppliance();
            appliance.cookFood();
            appliance.clean();
            appliance.safetyMeasures();
            appliance.storage();
            appliance.efficiency();

            System.out.println("-------------------------");

            Microwave microwave = new Microwave();
            microwave.cookFood();
            microwave.clean();
            microwave.safetyMeasures();
            microwave.storage();
            microwave.efficiency();

            System.out.println("-------------------------");

            KitchenAppliance appliance1 = new Microwave();
            appliance1.cookFood();
            appliance1.clean();
            appliance1.safetyMeasures();
            appliance1.storage();
            appliance1.efficiency();
        }
    }

