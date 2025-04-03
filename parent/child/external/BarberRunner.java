package parent.child.external;

import parent.child.internal.Barber;
import parent.child.internal.HairStylist;

public class BarberRunner {

        public static void main(String[] args) {
            Barber barber = new Barber();
            barber.haircut();
            barber.shaving();
            barber.styling();
            barber.products();
            barber.tools();

            System.out.println("-------------------------");

            HairStylist hairStylist = new HairStylist();
            hairStylist.haircut();
            hairStylist.shaving();
            hairStylist.styling();
            hairStylist.products();
            hairStylist.tools();

            System.out.println("-------------------------");

            Barber barber1 = new HairStylist();
            barber1.haircut();
            barber1.shaving();
            barber1.styling();
            barber1.products();
            barber1.tools();
        }
    }

