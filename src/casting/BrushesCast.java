package casting;

public class BrushesCast {
    public void cast(Brushes brushes) {
        System.out.println("Casting Brushes");
        brushes.material();
        brushes.usage();
        brushes.size();
        brushes.bristleType();
        brushes.durability();
        if(brushes instanceof BrushesDetails) {
            BrushesDetails ref = (BrushesDetails)brushes;
            ref.extraMethod();
        }
    }
}
