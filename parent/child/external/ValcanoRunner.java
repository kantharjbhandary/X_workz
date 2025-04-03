package parent.child.external;

import parent.child.internal.ActiveVolcano;
import parent.child.internal.Valcano;

public class ValcanoRunner {

        public static void main(String[] args) {

            Valcano volcano = new Valcano();
            volcano.type();
            volcano.eruption();
            volcano.location();
            volcano.impact();
            volcano.monitoring();

            System.out.println("-------------------------");


            ActiveVolcano activeVolcano = new ActiveVolcano();
            activeVolcano.type();
            activeVolcano.eruption();
            activeVolcano.location();
            activeVolcano.impact();
            activeVolcano.monitoring();

            System.out.println("-------------------------");


            Valcano volcano1 = new ActiveVolcano();
            volcano1.type();
            volcano1.eruption();
            volcano1.location();
            volcano1.impact();
            volcano1.monitoring();
        }
    }



