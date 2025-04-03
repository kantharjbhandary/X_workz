package parent.child.external;

import parent.child.internal.Farmer;
import parent.child.internal.OrganicFarmer;

public class FarmerRunner {
        public static void main(String[] args) {
            Farmer farmer = new Farmer();
            farmer.crops();
            farmer.irrigation();
            farmer.livestock();
            farmer.equipment();
            farmer.market();

            System.out.println("-------------------------");

            OrganicFarmer organicFarmer = new OrganicFarmer();
            organicFarmer.crops();
            organicFarmer.irrigation();
            organicFarmer.livestock();
            organicFarmer.equipment();
            organicFarmer.market();

            System.out.println("-------------------------");

            Farmer farmer1 = new OrganicFarmer();
            farmer1.crops();
            farmer1.irrigation();
            farmer1.livestock();
            farmer1.equipment();
            farmer1.market();
        }
    }

