package parent.child.external;

import parent.child.internal.Agroforestry;
import parent.child.internal.Forestry;

public class ForestryRunner {

        public static void main(String[] args) {
            Forestry forestry = new Forestry();
            forestry.conservation();
            forestry.timber();
            forestry.biodiversity();
            forestry.afforestation();
            forestry.economy();

            System.out.println("-------------------------");

            Agroforestry agroforestry = new Agroforestry();
            agroforestry.conservation();
            agroforestry.timber();
            agroforestry.biodiversity();
            agroforestry.afforestation();
            agroforestry.economy();

            System.out.println("-------------------------");

            Forestry forestry1 = new Agroforestry();
            forestry1.conservation();
            forestry1.timber();
            forestry1.biodiversity();
            forestry1.afforestation();
            forestry1.economy();
        }
    }


