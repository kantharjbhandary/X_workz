package parent.child.external;

import parent.child.internal.Bracelet;
import parent.child.internal.GoldBracelet;

public class BraceletRunner {

        public static void main(String[] args) {
            Bracelet bracelet = new Bracelet();
            bracelet.material();
            bracelet.design();
            bracelet.usage();
            bracelet.history();
            bracelet.price();

            System.out.println("-------------------------");

            GoldBracelet goldBracelet = new GoldBracelet();
            goldBracelet.material();
            goldBracelet.design();
            goldBracelet.usage();
            goldBracelet.history();
            goldBracelet.price();

            System.out.println("-------------------------");

            Bracelet bracelet1 = new GoldBracelet();
            bracelet1.material();
            bracelet1.design();
            bracelet1.usage();
            bracelet1.history();
            bracelet1.price();
        }

}
