package parent.child.external;

import parent.child.internal.HerbalToothpaste;
import parent.child.internal.Toothpaste;

public class ToothPasteRunner {

        public static void main(String[] args) {
            Toothpaste toothpaste = new Toothpaste();
            toothpaste.ingredients();
            toothpaste.flavor();
            toothpaste.brand();
            toothpaste.benefits();
            toothpaste.usage();

            System.out.println("-------------------------");

            HerbalToothpaste herbalToothpaste = new HerbalToothpaste();
            herbalToothpaste.ingredients();
            herbalToothpaste.flavor();
            herbalToothpaste.brand();
            herbalToothpaste.benefits();
            herbalToothpaste.usage();

            System.out.println("-------------------------");

            Toothpaste toothpaste1 = new HerbalToothpaste();
            toothpaste1.ingredients();
            toothpaste1.flavor();
            toothpaste1.brand();
            toothpaste1.benefits();
            toothpaste1.usage();
        }
    }

