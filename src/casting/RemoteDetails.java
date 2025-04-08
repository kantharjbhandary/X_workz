package casting;

public class RemoteDetails extends Remote {
    @Override
    public void deviceCompatibility() {
        System.out.println("Overridden: deviceCompatibility in RemoteDetails");
    }

    @Override
    public void batteryType() {
        System.out.println("Overridden: batteryType in RemoteDetails");
    }

    @Override
    public void numberOfButtons() {
        System.out.println("Overridden: numberOfButtons in RemoteDetails");
    }

    @Override
    public void wireless() {
        System.out.println("Overridden: wireless in RemoteDetails");
    }

    @Override
    public void brand() {
        System.out.println("Overridden: brand in RemoteDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in RemoteDetails");
    }
}
