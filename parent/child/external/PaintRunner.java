package parent.child.external;

import parent.child.internal.Brushes;
import parent.child.internal.PaintBrush;

public class PaintRunner {
        public static void main(String[] args) {
            Brushes brushes = new Brushes();
            brushes.material();
            brushes.usage();
            brushes.size();
            brushes.bristleType();
            brushes.durability();

            System.out.println("-------------------------");

            PaintBrush paintBrush = new PaintBrush();
            paintBrush.material();
            paintBrush.usage();
            paintBrush.size();
            paintBrush.bristleType();
            paintBrush.durability();

            System.out.println("-------------------------");

            Brushes brushes1 = new PaintBrush();
            brushes1.material();
            brushes1.usage();
            brushes1.size();
            brushes1.bristleType();
            brushes1.durability();
        }
    }


