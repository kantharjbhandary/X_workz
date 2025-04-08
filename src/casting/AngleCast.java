package casting;

public class AngleCast {
    public void cast(Angle angle) {
        System.out.println("Casting Angle");
        angle.measurement();
        angle.types();
        angle.usage();
        angle.calculation();
        angle.properties();
        if(angle instanceof AngleDetails) {
            AngleDetails ref = (AngleDetails)angle;
            ref.extraMethod();
        }
    }
}
