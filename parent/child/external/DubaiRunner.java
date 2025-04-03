package parent.child.external;

import parent.child.internal.BurjKhalifa;
import parent.child.internal.Dubai;

public class DubaiRunner {

        public static void main(String[] args) {
            Dubai dubai = new Dubai();
            dubai.tourism();
            dubai.economy();
            dubai.architecture();
            dubai.climate();
            dubai.culture();

            System.out.println("-------------------------");

            BurjKhalifa burjKhalifa = new BurjKhalifa();
            burjKhalifa.tourism();
            burjKhalifa.economy();
            burjKhalifa.architecture();
            burjKhalifa.climate();
            burjKhalifa.culture();

            System.out.println("-------------------------");

            Dubai dubai1 = new BurjKhalifa();
            dubai1.tourism();
            dubai1.economy();
            dubai1.architecture();
            dubai1.climate();
            dubai1.culture();
        }

}
