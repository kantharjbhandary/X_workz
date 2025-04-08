package casting;

public class AngleDetails extends Angle {
    @Override
    public void measurement() {
        System.out.println("Overridden: measurement in AngleDetails");
    }

    @Override
    public void types() {
        System.out.println("Overridden: types in AngleDetails");
    }

    @Override
    public void usage() {
        System.out.println("Overridden: usage in AngleDetails");
    }

    @Override
    public void calculation() {
        System.out.println("Overridden: calculation in AngleDetails");
    }

    @Override
    public void properties() {
        System.out.println("Overridden: properties in AngleDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in AngleDetails");
    }
}
