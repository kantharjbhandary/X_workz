package parent.child.external;

import parent.child.internal.WWE;
import parent.child.internal.WWEEvent;

public class WWERunner {

        public static void main(String[] args) {
            WWE wwe = new WWE();
            wwe.wrestlers();
            wwe.events();
            wwe.championships();
            wwe.audience();
            wwe.entertainment();

            System.out.println("-------------------------");

            WWEEvent wweEvent = new WWEEvent();
            wweEvent.wrestlers();
            wweEvent.events();
            wweEvent.championships();
            wweEvent.audience();
            wweEvent.entertainment();

            System.out.println("-------------------------");

            WWE wwe1 = new WWEEvent();
            wwe1.wrestlers();
            wwe1.events();
            wwe1.championships();
            wwe1.audience();
            wwe1.entertainment();
        }
    }


