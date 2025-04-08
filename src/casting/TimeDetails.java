package casting;

public class TimeDetails extends Time {
    @Override
    public void measurement() {
        System.out.println("Overridden: measurement in TimeDetails");
    }

    @Override
    public void concept() {
        System.out.println("Overridden: concept in TimeDetails");
    }

    @Override
    public void zones() {
        System.out.println("Overridden: zones in TimeDetails");
    }

    @Override
    public void relativity() {
        System.out.println("Overridden: relativity in TimeDetails");
    }

    @Override
    public void importance() {
        System.out.println("Overridden: importance in TimeDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in TimeDetails");
    }
}
