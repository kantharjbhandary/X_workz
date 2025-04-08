package casting;

public class AvengersDetails extends Avengers {
    @Override
    public void members() {
        System.out.println("Overridden: members in AvengersDetails");
    }

    @Override
    public void mission() {
        System.out.println("Overridden: mission in AvengersDetails");
    }

    @Override
    public void enemies() {
        System.out.println("Overridden: enemies in AvengersDetails");
    }

    @Override
    public void leader() {
        System.out.println("Overridden: leader in AvengersDetails");
    }

    @Override
    public void popularity() {
        System.out.println("Overridden: popularity in AvengersDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in AvengersDetails");
    }
}
