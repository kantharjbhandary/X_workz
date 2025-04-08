package casting;

public class ElectronicDeviceCast {
    public void cast(ElectronicDevice electronicDevice) {
        System.out.println("Casting ElectronicDevice");
        electronicDevice.powerOn();
        electronicDevice.powerOff();
        electronicDevice.energyConsumption();
        electronicDevice.connectivity();
        electronicDevice.brand();
        if(electronicDevice instanceof ElectronicDeviceDetails) {
            ElectronicDeviceDetails ref = (ElectronicDeviceDetails)electronicDevice;
            ref.extraMethod();
        }
    }
}
