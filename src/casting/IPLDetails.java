package casting;

public class IPLDetails extends IPL {
    @Override
    public void teams() {
        System.out.println("Overridden: teams in IPLDetails");
    }

    @Override
    public void format() {
        System.out.println("Overridden: format in IPLDetails");
    }

    @Override
    public void schedule() {
        System.out.println("Overridden: schedule in IPLDetails");
    }

    @Override
    public void sponsors() {
        System.out.println("Overridden: sponsors in IPLDetails");
    }

    @Override
    public void popularity() {
        System.out.println("Overridden: popularity in IPLDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in IPLDetails");
    }
}
