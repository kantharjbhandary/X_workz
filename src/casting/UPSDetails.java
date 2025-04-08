package casting;

public class UPSDetails extends UPS {
    @Override
    public void powerBackup() {
        System.out.println("Overridden: powerBackup in UPSDetails");
    }

    @Override
    public void batteryType() {
        System.out.println("Overridden: batteryType in UPSDetails");
    }

    @Override
    public void applications() {
        System.out.println("Overridden: applications in UPSDetails");
    }

    @Override
    public void chargingTime() {
        System.out.println("Overridden: chargingTime in UPSDetails");
    }

    @Override
    public void efficiency() {
        System.out.println("Overridden: efficiency in UPSDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in UPSDetails");
    }
}
