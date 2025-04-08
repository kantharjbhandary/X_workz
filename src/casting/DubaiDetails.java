package casting;

public class DubaiDetails extends Dubai {
    @Override
    public void tourism() {
        System.out.println("Overridden: tourism in DubaiDetails");
    }

    @Override
    public void economy() {
        System.out.println("Overridden: economy in DubaiDetails");
    }

    @Override
    public void architecture() {
        System.out.println("Overridden: architecture in DubaiDetails");
    }

    @Override
    public void climate() {
        System.out.println("Overridden: climate in DubaiDetails");
    }

    @Override
    public void culture() {
        System.out.println("Overridden: culture in DubaiDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in DubaiDetails");
    }
}
