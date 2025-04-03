package parent.child.external;

import parent.child.internal.CoconutOil;
import parent.child.internal.Oil;

public class OilRunner {
        public static void main(String[] args) {
            Oil oil = new Oil();
            oil.source();
            oil.usage();
            oil.refining();
            oil.healthBenefits();
            oil.storage();

            System.out.println("-------------------------");

            CoconutOil coconutOil = new CoconutOil();
            coconutOil.source();
            coconutOil.usage();
            coconutOil.refining();
            coconutOil.healthBenefits();
            coconutOil.storage();

            System.out.println("-------------------------");

            Oil oil1 = new CoconutOil();
            oil1.source();
            oil1.usage();
            oil1.refining();
            oil1.healthBenefits();
            oil1.storage();
        }
    }

