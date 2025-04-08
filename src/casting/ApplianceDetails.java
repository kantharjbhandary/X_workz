package casting;

public class ApplianceDetails extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("Overridden: turnOn in ApplianceDetails");
    }

    @Override
    public void turnOff() {
        System.out.println("Overridden: turnOff in ApplianceDetails");
    }

    @Override
    public void powerSource() {
        System.out.println("Overridden: powerSource in ApplianceDetails");
    }

    @Override
    public void warranty() {
        System.out.println("Overridden: warranty in ApplianceDetails");
    }

    @Override
    public void maintenance() {
        System.out.println("Overridden: maintenance in ApplianceDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in ApplianceDetails");
    }
}
