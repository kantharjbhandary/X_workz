package parent.child.external;

import parent.child.internal.OnlineUPS;
import parent.child.internal.UPS;

public class UPSRunneer {
        public static void main(String[] args) {
            UPS ups = new UPS();
            ups.powerBackup();
            ups.batteryType();
            ups.applications();
            ups.chargingTime();
            ups.efficiency();

            System.out.println("-------------------------");

            OnlineUPS onlineUPS = new OnlineUPS();
            onlineUPS.powerBackup();
            onlineUPS.batteryType();
            onlineUPS.applications();
            onlineUPS.chargingTime();
            onlineUPS.efficiency();

            System.out.println("-------------------------");

            UPS ups1 = new OnlineUPS();
            ups1.powerBackup();
            ups1.batteryType();
            ups1.applications();
            ups1.chargingTime();
            ups1.efficiency();
        }
    }

