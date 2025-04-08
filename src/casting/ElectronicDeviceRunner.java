package casting;

public class ElectronicDeviceRunner {
    public static void main(String[] args) {

        ElectronicDevice electronicDevice = new ElectronicDevice();
        electronicDevice.powerOn();
        electronicDevice.powerOff();
        electronicDevice.energyConsumption();
        electronicDevice.connectivity();
        electronicDevice.brand();
        System.out.println("----------------------");

        ElectronicDevice electronicDevicePoly = new ElectronicDeviceDetails();
        electronicDevicePoly.powerOn();
        electronicDevicePoly.powerOff();
        electronicDevicePoly.energyConsumption();
        electronicDevicePoly.connectivity();
        electronicDevicePoly.brand();
        System.out.println("----------------------");

        ElectronicDeviceDetails electronicDeviceDetails = new ElectronicDeviceDetails();
        electronicDeviceDetails.powerOn();
        electronicDeviceDetails.powerOff();
        electronicDeviceDetails.energyConsumption();
        electronicDeviceDetails.connectivity();
        electronicDeviceDetails.brand();
        electronicDeviceDetails.extraMethod();
        System.out.println("----------------------");

        ElectronicDeviceCast electronicDeviceCast = new ElectronicDeviceCast();
        electronicDeviceCast.cast(electronicDevicePoly);
    }
}
