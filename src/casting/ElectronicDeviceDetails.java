package casting;

public class ElectronicDeviceDetails extends ElectronicDevice {
    @Override
    public void powerOn() {
        System.out.println("Overridden: powerOn in ElectronicDeviceDetails");
    }

    @Override
    public void powerOff() {
        System.out.println("Overridden: powerOff in ElectronicDeviceDetails");
    }

    @Override
    public void energyConsumption() {
        System.out.println("Overridden: energyConsumption in ElectronicDeviceDetails");
    }

    @Override
    public void connectivity() {
        System.out.println("Overridden: connectivity in ElectronicDeviceDetails");
    }

    @Override
    public void brand() {
        System.out.println("Overridden: brand in ElectronicDeviceDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in ElectronicDeviceDetails");
    }
}
