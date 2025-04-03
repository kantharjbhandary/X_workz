package parent.child.external;

import parent.child.internal.India;
import parent.child.internal.Delhi;

public class IndiaRunner {
        public static void main(String[] args) {
            India india = new India();
            india.states();
            india.diversity();
            india.economy();
            india.history();
            india.festivals();

            System.out.println("-------------------------");

            Delhi delhi = new Delhi();
            delhi.states();
            delhi.diversity();
            delhi.economy();
            delhi.history();
            delhi.festivals();

            System.out.println("-------------------------");

            India india1 = new Delhi();
            india1.states();
            india1.diversity();
            india1.economy();
            india1.history();
            india1.festivals();
        }
    }

