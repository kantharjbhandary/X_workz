package parent.child.external;

import parent.child.internal.Appliance;
import parent.child.internal.Refrigerator;

public class ApplianceRunner {

        public static void main(String[] args) {
            Appliance appliance = new Appliance();
            appliance.turnOn();
            appliance.turnOff();
            appliance.powerSource();
            appliance.warranty();
            appliance.maintenance();

            System.out.println("-------------------------");

            Refrigerator refrigerator = new Refrigerator();
            refrigerator.turnOn();
            refrigerator.turnOff();
            refrigerator.powerSource();
            refrigerator.warranty();
            refrigerator.maintenance();

            System.out.println("-------------------------");

            Appliance appliance1 = new Refrigerator();
            appliance1.turnOn();
            appliance1.turnOff();
            appliance1.powerSource();
            appliance1.warranty();
            appliance1.maintenance();
        }
    }

