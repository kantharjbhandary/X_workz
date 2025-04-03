package parent.child.external;

import parent.child.internal.ElectronicDevice;
import parent.child.internal.Television;

public class ElectronicDeviceRunner {
        public static void main(String[] args) {
            ElectronicDevice electronicDevice = new ElectronicDevice();
            electronicDevice.powerOn();
            electronicDevice.powerOff();
            electronicDevice.energyConsumption();
            electronicDevice.connectivity();
            electronicDevice.brand();

            System.out.println("-------------------------");

            Television television = new Television();
            television.powerOn();
            television.powerOff();
            television.energyConsumption();
            television.connectivity();
            television.brand();

            System.out.println("-------------------------");

            ElectronicDevice electronicDevice1 = new Television();
            electronicDevice1.powerOn();
            electronicDevice1.powerOff();
            electronicDevice1.energyConsumption();
            electronicDevice1.connectivity();
            electronicDevice1.brand();
        }
    }

