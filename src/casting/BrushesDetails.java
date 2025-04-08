package casting;

public class BrushesDetails extends Brushes {
    @Override
    public void material() {
        System.out.println("Overridden: material in BrushesDetails");
    }

    @Override
    public void usage() {
        System.out.println("Overridden: usage in BrushesDetails");
    }

    @Override
    public void size() {
        System.out.println("Overridden: size in BrushesDetails");
    }

    @Override
    public void bristleType() {
        System.out.println("Overridden: bristleType in BrushesDetails");
    }

    @Override
    public void durability() {
        System.out.println("Overridden: durability in BrushesDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in BrushesDetails");
    }
}
