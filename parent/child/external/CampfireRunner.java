package parent.child.external;

import parent.child.internal.Bonfire;
import parent.child.internal.Campfire;

public class CampfireRunner {

        public static void main(String[] args) {
            Campfire campfire = new Campfire();
            campfire.fuelType();
            campfire.purpose();
            campfire.safety();
            campfire.duration();
            campfire.location();

            System.out.println("-------------------------");

            Bonfire bonfire = new Bonfire();
            bonfire.fuelType();
            bonfire.purpose();
            bonfire.safety();
            bonfire.duration();
            bonfire.location();

            System.out.println("-------------------------");

            Campfire campfire1 = new Bonfire();
            campfire1.fuelType();
            campfire1.purpose();
            campfire1.safety();
            campfire1.duration();
            campfire1.location();
        }


}
