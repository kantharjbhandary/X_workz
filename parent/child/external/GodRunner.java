package parent.child.external;

import parent.child.internal.God;
import parent.child.internal.HinduGod;

public class GodRunner {

        public static void main(String[] args) {
            God god = new God();
            god.worship();
            god.teachings();
            god.temples();
            god.faith();
            god.festivals();

            System.out.println("-------------------------");

            HinduGod hindhuGod = new HinduGod();
            hindhuGod.worship();
            hindhuGod.teachings();
            hindhuGod.temples();
            hindhuGod.faith();
            hindhuGod.festivals();

            System.out.println("-------------------------");

            God god1 = new HinduGod();
            god1.worship();
            god1.teachings();
            god1.temples();
            god1.faith();
            god1.festivals();
        }
    }


