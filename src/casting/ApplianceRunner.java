package casting;

public class ApplianceRunner {
    public static void main(String[] args) {

        Appliance appliance = new Appliance();
        appliance.turnOn();
        appliance.turnOff();
        appliance.powerSource();
        appliance.warranty();
        appliance.maintenance();
        System.out.println("----------------------");

        Appliance appliancePoly = new ApplianceDetails();
        appliancePoly.turnOn();
        appliancePoly.turnOff();
        appliancePoly.powerSource();
        appliancePoly.warranty();
        appliancePoly.maintenance();
        System.out.println("----------------------");

        ApplianceDetails applianceDetails = new ApplianceDetails();
        applianceDetails.turnOn();
        applianceDetails.turnOff();
        applianceDetails.powerSource();
        applianceDetails.warranty();
        applianceDetails.maintenance();
        applianceDetails.extraMethod();
        System.out.println("----------------------");

        ApplianceCast applianceCast = new ApplianceCast();
        applianceCast.cast(appliancePoly);
    }
}
