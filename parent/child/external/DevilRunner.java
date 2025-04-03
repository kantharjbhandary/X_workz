package parent.child.external;

import parent.child.internal.Devil;
import parent.child.internal.MythicalDevil;

public class DevilRunner {

        public static void main(String[] args) {
            Devil devil = new Devil();
            devil.evil();
            devil.trickery();
            devil.darkness();
            devil.myths();
            devil.fear();

            System.out.println("-------------------------");

            MythicalDevil mythicalDevil = new MythicalDevil();
            mythicalDevil.evil();
            mythicalDevil.trickery();
            mythicalDevil.darkness();
            mythicalDevil.myths();
            mythicalDevil.fear();

            System.out.println("-------------------------");

            Devil devil1 = new MythicalDevil();
            devil1.evil();
            devil1.trickery();
            devil1.darkness();
            devil1.myths();
            devil1.fear();
        }
    }

