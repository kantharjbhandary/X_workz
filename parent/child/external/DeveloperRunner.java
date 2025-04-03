package parent.child.external;

import parent.child.internal.Developer;
import parent.child.internal.SoftwareEngineer;

public class DeveloperRunner {

        public static void main(String[] args) {
            Developer developer = new Developer();
            developer.coding();
            developer.debugging();
            developer.testing();
            developer.collaboration();
            developer.deployment();

            System.out.println("-------------------------");

            SoftwareEngineer softwareEngineer = new SoftwareEngineer();
            softwareEngineer.coding();
            softwareEngineer.debugging();
            softwareEngineer.testing();
            softwareEngineer.collaboration();
            softwareEngineer.deployment();

            System.out.println("-------------------------");

            Developer developer1 = new SoftwareEngineer();
            developer1.coding();
            developer1.debugging();
            developer1.testing();
            developer1.collaboration();
            developer1.deployment();
        }
    }

