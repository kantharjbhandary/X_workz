package parent.child.external;

import parent.child.internal.Floriculture;
import parent.child.internal.Horticulture;

public class HorticultureRunner {

        public static void main(String[] args) {
            Horticulture horticulture = new Horticulture();
            horticulture.fruits();
            horticulture.vegetables();
            horticulture.floriculture();
            horticulture.landscaping();
            horticulture.economy();

            System.out.println("-------------------------");

            Floriculture floriculture = new Floriculture();
            floriculture.fruits();
            floriculture.vegetables();
            floriculture.floriculture();
            floriculture.landscaping();
            floriculture.economy();

            System.out.println("-------------------------");

            Horticulture horticulture1 = new Floriculture();
            horticulture1.fruits();
            horticulture1.vegetables();
            horticulture1.floriculture();
            horticulture1.landscaping();
            horticulture1.economy();
        }
    }
