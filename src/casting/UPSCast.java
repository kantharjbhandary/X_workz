package casting;

public class UPSCast {
    public void cast(UPS uPS) {
        System.out.println("Casting UPS");
        uPS.powerBackup();
        uPS.batteryType();
        uPS.applications();
        uPS.chargingTime();
        uPS.efficiency();
        if(uPS instanceof UPSDetails) {
            UPSDetails ref = (UPSDetails)uPS;
            ref.extraMethod();
        }
    }
}
