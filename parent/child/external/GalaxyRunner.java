package parent.child.external;

import parent.child.internal.Galaxy;
import parent.child.internal.MilkyWay;

public class GalaxyRunner {

        public static void main(String[] args) {
            Galaxy galaxy = new Galaxy();
            galaxy.composition();
            galaxy.types();
            galaxy.distance();
            galaxy.discovery();
            galaxy.size();

            System.out.println("-------------------------");

            MilkyWay milkyWave = new MilkyWay();
            milkyWave.composition();
            milkyWave.types();
            milkyWave.distance();
            milkyWave.discovery();
            milkyWave.size();

            System.out.println("-------------------------");

            Galaxy galaxy1 = new MilkyWay();
            galaxy1.composition();
            galaxy1.types();
            galaxy1.distance();
            galaxy1.discovery();
            galaxy1.size();
        }

}
