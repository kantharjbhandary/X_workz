package parent.child.external;

import parent.child.internal.IPL;
import parent.child.internal.IPLMatch;

public class IPLRunner {
        public static void main(String[] args) {
            IPL ipl = new IPL();
            ipl.teams();
            ipl.format();
            ipl.schedule();
            ipl.sponsors();
            ipl.popularity();

            System.out.println("-------------------------");

            IPLMatch iplMatch = new IPLMatch();
            iplMatch.teams();
            iplMatch.format();
            iplMatch.schedule();
            iplMatch.sponsors();
            iplMatch.popularity();

            System.out.println("-------------------------");

            IPL ipl1 = new IPLMatch();
            ipl1.teams();
            ipl1.format();
            ipl1.schedule();
            ipl1.sponsors();
            ipl1.popularity();
        }
    }


