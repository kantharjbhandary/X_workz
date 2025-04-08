package casting;

public class ColorDetails extends Color {
    @Override
    public void shades() {
        System.out.println("Overridden: shades in ColorDetails");
    }

    @Override
    public void hexCode() {
        System.out.println("Overridden: hexCode in ColorDetails");
    }

    @Override
    public void usage() {
        System.out.println("Overridden: usage in ColorDetails");
    }

    @Override
    public void perception() {
        System.out.println("Overridden: perception in ColorDetails");
    }

    @Override
    public void contrast() {
        System.out.println("Overridden: contrast in ColorDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in ColorDetails");
    }
}
