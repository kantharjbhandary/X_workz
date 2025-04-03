package parent.child.external;

import parent.child.internal.Avengers;
import parent.child.internal.IronMan;

public class AvengerRunner {

        public static void main(String[] args) {
            Avengers avengers = new Avengers();
            avengers.members();
            avengers.mission();
            avengers.enemies();
            avengers.leader();
            avengers.popularity();

            System.out.println("-------------------------");

            IronMan ironMan = new IronMan();
            ironMan.members();
            ironMan.mission();
            ironMan.enemies();
            ironMan.leader();
            ironMan.popularity();

            System.out.println("-------------------------");

            Avengers avengers1 = new IronMan();
            avengers1.members();
            avengers1.mission();
            avengers1.enemies();
            avengers1.leader();
            avengers1.popularity();
        }
    }


