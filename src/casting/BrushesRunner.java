package casting;

public class BrushesRunner {
    public static void main(String[] args) {

        Brushes brushes = new Brushes();
        brushes.material();
        brushes.usage();
        brushes.size();
        brushes.bristleType();
        brushes.durability();
        System.out.println("----------------------");

        Brushes brushesPoly = new BrushesDetails();
        brushesPoly.material();
        brushesPoly.usage();
        brushesPoly.size();
        brushesPoly.bristleType();
        brushesPoly.durability();
        System.out.println("----------------------");

        BrushesDetails brushesDetails = new BrushesDetails();
        brushesDetails.material();
        brushesDetails.usage();
        brushesDetails.size();
        brushesDetails.bristleType();
        brushesDetails.durability();
        brushesDetails.extraMethod();
        System.out.println("----------------------");

        BrushesCast brushesCast = new BrushesCast();
        brushesCast.cast(brushesPoly);
    }
}
