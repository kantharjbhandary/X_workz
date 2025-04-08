package casting;

public class CPUDetails extends CPU {
    @Override
    public void cores() {
        System.out.println("Overridden: cores in CPUDetails");
    }

    @Override
    public void speed() {
        System.out.println("Overridden: speed in CPUDetails");
    }

    @Override
    public void architecture() {
        System.out.println("Overridden: architecture in CPUDetails");
    }

    @Override
    public void powerConsumption() {
        System.out.println("Overridden: powerConsumption in CPUDetails");
    }

    @Override
    public void brands() {
        System.out.println("Overridden: brands in CPUDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in CPUDetails");
    }
}
