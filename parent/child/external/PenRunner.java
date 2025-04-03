package parent.child.external;

import parent.child.internal.BallPen;
import parent.child.internal.Pen;

public class PenRunner {

        public static void main(String[] args) {
            Pen pen = new Pen();
            pen.inkType();
            pen.color();
            pen.brand();
            pen.usage();
            pen.durability();

            System.out.println("-------------------------");

            BallPen ballPen = new BallPen();
            ballPen.inkType();
            ballPen.color();
            ballPen.brand();
            ballPen.usage();
            ballPen.durability();

            System.out.println("-------------------------");

            Pen pen1 = new BallPen();
            pen1.inkType();
            pen1.color();
            pen1.brand();
            pen1.usage();
            pen1.durability();
        }
    }


