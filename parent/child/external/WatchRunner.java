package parent.child.external;

import parent.child.internal.SmartWatch;
import parent.child.internal.Watch;

public class WatchRunner {

        public static void main(String[] args) {
            Watch watch = new Watch();
            watch.brand();
            watch.type();
            watch.material();
            watch.waterproof();
            watch.priceRange();

            System.out.println("-------------------------");

            SmartWatch smartWatch = new SmartWatch();
            smartWatch.brand();
            smartWatch.type();
            smartWatch.material();
            smartWatch.waterproof();
            smartWatch.priceRange();

            System.out.println("-------------------------");

            Watch watch1 = new SmartWatch();
            watch1.brand();
            watch1.type();
            watch1.material();
            watch1.waterproof();
            watch1.priceRange();
        }
    }

