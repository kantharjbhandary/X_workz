package casting;

public class WWEDetails extends WWE {
    @Override
    public void wrestlers() {
        System.out.println("Overridden: wrestlers in WWEDetails");
    }

    @Override
    public void events() {
        System.out.println("Overridden: events in WWEDetails");
    }

    @Override
    public void championships() {
        System.out.println("Overridden: championships in WWEDetails");
    }

    @Override
    public void audience() {
        System.out.println("Overridden: audience in WWEDetails");
    }

    @Override
    public void entertainment() {
        System.out.println("Overridden: entertainment in WWEDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in WWEDetails");
    }
}
