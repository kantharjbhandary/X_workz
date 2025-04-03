package parent.child.external;

import parent.child.internal.AI;
import parent.child.internal.Technology;

public class TechnologyRunner {

        public static void main(String[] args) {
            Technology technology = new Technology();
            technology.category();
            technology.impact();
            technology.evolution();
            technology.applications();
            technology.futureTrends();

            System.out.println("-------------------------");

            AI ai = new AI();
            ai.category();
            ai.impact();
            ai.evolution();
            ai.applications();
            ai.futureTrends();

            System.out.println("-------------------------");

            Technology technology1 = new AI();
            technology1.category();
            technology1.impact();
            technology1.evolution();
            technology1.applications();
            technology1.futureTrends();
        }
    }


