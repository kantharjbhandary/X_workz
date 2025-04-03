package parent.child.external;

import parent.child.internal.CoronaVirus;
import parent.child.internal.Covid19;

public class CoronaRunner {
        public static void main(String[] args) {
            CoronaVirus coronaVirus = new CoronaVirus();
            coronaVirus.symptoms();
            coronaVirus.spread();
            coronaVirus.precautions();
            coronaVirus.vaccination();
            coronaVirus.globalImpact();

            System.out.println("-------------------------");

            Covid19 covid19 = new Covid19();
            covid19.symptoms();
            covid19.spread();
            covid19.precautions();
            covid19.vaccination();
            covid19.globalImpact();

            System.out.println("-------------------------");

            CoronaVirus coronaVirus1 = new Covid19();
            coronaVirus1.symptoms();
            coronaVirus1.spread();
            coronaVirus1.precautions();
            coronaVirus1.vaccination();
            coronaVirus1.globalImpact();
        }
    }

