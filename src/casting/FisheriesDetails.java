package casting;

public class FisheriesDetails extends Fisheries {
    @Override
    public void aquaculture() {
        System.out.println("Overridden: aquaculture in FisheriesDetails");
    }

    @Override
    public void marine() {
        System.out.println("Overridden: marine in FisheriesDetails");
    }

    @Override
    public void freshwater() {
        System.out.println("Overridden: freshwater in FisheriesDetails");
    }

    @Override
    public void breeding() {
        System.out.println("Overridden: breeding in FisheriesDetails");
    }

    @Override
    public void economy() {
        System.out.println("Overridden: economy in FisheriesDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in FisheriesDetails");
    }
}
