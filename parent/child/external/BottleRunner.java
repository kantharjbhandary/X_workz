package parent.child.external;

import parent.child.internal.Bottle;
import parent.child.internal.WaterBottle;

public class BottleRunner {

        public static void main(String[] args) {
            Bottle bottle = new Bottle();
            bottle.material();
            bottle.capacity();
            bottle.usage();
            bottle.brands();
            bottle.design();

            System.out.println("-------------------------");

            WaterBottle waterBottle = new WaterBottle();
            waterBottle.material();
            waterBottle.capacity();
            waterBottle.usage();
            waterBottle.brands();
            waterBottle.design();

            System.out.println("-------------------------");

            Bottle bottle1 = new WaterBottle();
            bottle1.material();
            bottle1.capacity();
            bottle1.usage();
            bottle1.brands();
            bottle1.design();
        }
    }

