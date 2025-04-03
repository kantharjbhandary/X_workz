package parent.child.external;

import parent.child.internal.Aquaculture;
import parent.child.internal.Fisheries;

public class FishetriesRunner {

        public static void main(String[] args) {
            Fisheries fisheries = new Fisheries();
            fisheries.aquaculture();
            fisheries.marine();
            fisheries.freshwater();
            fisheries.breeding();
            fisheries.economy();

            System.out.println("-------------------------");

            Aquaculture aquaculture = new Aquaculture();
            aquaculture.aquaculture();
            aquaculture.marine();
            aquaculture.freshwater();
            aquaculture.breeding();
            aquaculture.economy();

            System.out.println("-------------------------");

            Fisheries fisheries1 = new Aquaculture();
            fisheries1.aquaculture();
            fisheries1.marine();
            fisheries1.freshwater();
            fisheries1.breeding();
            fisheries1.economy();
        }
    }




