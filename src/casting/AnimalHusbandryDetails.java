package casting;

public class AnimalHusbandryDetails extends AnimalHusbandry {
    @Override
    public void livestock() {
        System.out.println("Overridden: livestock in AnimalHusbandryDetails");
    }

    @Override
    public void dairy() {
        System.out.println("Overridden: dairy in AnimalHusbandryDetails");
    }

    @Override
    public void poultry() {
        System.out.println("Overridden: poultry in AnimalHusbandryDetails");
    }

    @Override
    public void breeding() {
        System.out.println("Overridden: breeding in AnimalHusbandryDetails");
    }

    @Override
    public void economy() {
        System.out.println("Overridden: economy in AnimalHusbandryDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in AnimalHusbandryDetails");
    }
}
