package casting;

public class TechnologyDetails extends Technology {
    @Override
    public void category() {
        System.out.println("Overridden: category in TechnologyDetails");
    }

    @Override
    public void impact() {
        System.out.println("Overridden: impact in TechnologyDetails");
    }

    @Override
    public void evolution() {
        System.out.println("Overridden: evolution in TechnologyDetails");
    }

    @Override
    public void applications() {
        System.out.println("Overridden: applications in TechnologyDetails");
    }

    @Override
    public void futureTrends() {
        System.out.println("Overridden: futureTrends in TechnologyDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in TechnologyDetails");
    }
}
