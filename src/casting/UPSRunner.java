package casting;

public class UPSRunner {
    public static void main(String[] args) {

        UPS uPS = new UPS();
        uPS.powerBackup();
        uPS.batteryType();
        uPS.applications();
        uPS.chargingTime();
        uPS.efficiency();
        System.out.println("----------------------");

        UPS uPSPoly = new UPSDetails();
        uPSPoly.powerBackup();
        uPSPoly.batteryType();
        uPSPoly.applications();
        uPSPoly.chargingTime();
        uPSPoly.efficiency();
        System.out.println("----------------------");

        UPSDetails uPSDetails = new UPSDetails();
        uPSDetails.powerBackup();
        uPSDetails.batteryType();
        uPSDetails.applications();
        uPSDetails.chargingTime();
        uPSDetails.efficiency();
        uPSDetails.extraMethod();
        System.out.println("----------------------");

        UPSCast uPSCast = new UPSCast();
        uPSCast.cast(uPSPoly);
    }
}
