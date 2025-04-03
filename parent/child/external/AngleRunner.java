package parent.child.external;

import parent.child.internal.Angle;
import parent.child.internal.RightAngle;

public class AngleRunner {
    public static void main(String[] args) {
        Angle angle = new Angle();
        angle.measurement();
        angle.types();
        angle.usage();
        angle.calculation();
        angle.properties();

        System.out.println("-------------------------");

        RightAngle rightAngle = new RightAngle();
        rightAngle.measurement();
        rightAngle.types();
        rightAngle.usage();
        rightAngle.calculation();
        rightAngle.properties();

        System.out.println("-------------------------");

        Angle angle1 = new RightAngle();
        angle1.measurement();
        angle1.types();
        angle1.usage();
        angle1.calculation();
        angle1.properties();
    }
}
