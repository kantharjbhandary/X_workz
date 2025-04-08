package casting;

public class ForestryDetails extends Forestry {
    @Override
    public void conservation() {
        System.out.println("Overridden: conservation in ForestryDetails");
    }

    @Override
    public void timber() {
        System.out.println("Overridden: timber in ForestryDetails");
    }

    @Override
    public void biodiversity() {
        System.out.println("Overridden: biodiversity in ForestryDetails");
    }

    @Override
    public void afforestation() {
        System.out.println("Overridden: afforestation in ForestryDetails");
    }

    @Override
    public void economy() {
        System.out.println("Overridden: economy in ForestryDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in ForestryDetails");
    }
}
