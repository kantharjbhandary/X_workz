package casting;

public class CampfireDetails extends Campfire {
    @Override
    public void fuelType() {
        System.out.println("Overridden: fuelType in CampfireDetails");
    }

    @Override
    public void purpose() {
        System.out.println("Overridden: purpose in CampfireDetails");
    }

    @Override
    public void safety() {
        System.out.println("Overridden: safety in CampfireDetails");
    }

    @Override
    public void duration() {
        System.out.println("Overridden: duration in CampfireDetails");
    }

    @Override
    public void location() {
        System.out.println("Overridden: location in CampfireDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in CampfireDetails");
    }
}
