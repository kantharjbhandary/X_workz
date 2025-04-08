package casting;

public class ApplianceCast {
    public void cast(Appliance appliance) {
        System.out.println("Casting Appliance");
        appliance.turnOn();
        appliance.turnOff();
        appliance.powerSource();
        appliance.warranty();
        appliance.maintenance();
        if(appliance instanceof ApplianceDetails) {
            ApplianceDetails ref = (ApplianceDetails)appliance;
            ref.extraMethod();
        }
    }
}
