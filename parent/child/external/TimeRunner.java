package parent.child.external;

import parent.child.internal.DigitalTime;
import parent.child.internal.Time;

public class TimeRunner {

        public static void main(String[] args) {
            Time time = new Time();
            time.measurement();
            time.concept();
            time.zones();
            time.relativity();
            time.importance();

            System.out.println("-------------------------");

            DigitalTime digitalTime = new DigitalTime();
            digitalTime.measurement();
            digitalTime.concept();
            digitalTime.zones();
            digitalTime.relativity();
            digitalTime.importance();

            System.out.println("-------------------------");

            Time time1 = new DigitalTime();
            time1.measurement();
            time1.concept();
            time1.zones();
            time1.relativity();
            time1.importance();
        }


}
