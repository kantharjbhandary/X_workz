package casting;

public class AngleRunner {
    public static void main(String[] args) {

        Angle angle = new Angle();
        angle.measurement();
        angle.types();
        angle.usage();
        angle.calculation();
        angle.properties();
        System.out.println("----------------------");

        Angle anglePoly = new AngleDetails();
        anglePoly.measurement();
        anglePoly.types();
        anglePoly.usage();
        anglePoly.calculation();
        anglePoly.properties();
        System.out.println("----------------------");

        AngleDetails angleDetails = new AngleDetails();
        angleDetails.measurement();
        angleDetails.types();
        angleDetails.usage();
        angleDetails.calculation();
        angleDetails.properties();
        angleDetails.extraMethod();
        System.out.println("----------------------");

        AngleCast angleCast = new AngleCast();
        angleCast.cast(anglePoly);
    }
}
