package parent.child.external;

import parent.child.internal.Stars;
import parent.child.internal.Sun;

public class SunRunner {

        public static void main(String[] args) {
            Stars stars = new Stars();
            stars.brightness();
            stars.size();
            stars.composition();
            stars.lifecycle();
            stars.constellations();

            System.out.println("-------------------------");

            Sun sun = new Sun();
            sun.brightness();
            sun.size();
            sun.composition();
            sun.lifecycle();
            sun.constellations();

            System.out.println("-------------------------");

            Stars stars1 = new Sun();
            stars1.brightness();
            stars1.size();
            stars1.composition();
            stars1.lifecycle();
            stars1.constellations();
        }


}
