package parent.child.external;

import parent.child.internal.NationalPark;
import parent.child.internal.Park;

public class ParkRunner {
    public static void main(String[] args) {


            Park park = new Park();
            park.size();
            park.facilities();
            park.environment();
            park.activities();
            park.maintenance();

            System.out.println("-------------------------");

            NationalPark nationalPark = new NationalPark();
            nationalPark.size();
            nationalPark.facilities();
            nationalPark.environment();
            nationalPark.activities();
            nationalPark.maintenance();

            System.out.println("-------------------------");

            Park park1 = new NationalPark();
            park1.size();
            park1.facilities();
            park1.environment();
            park1.activities();
            park1.maintenance();
        }
    }


