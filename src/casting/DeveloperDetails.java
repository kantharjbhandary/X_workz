package casting;

public class DeveloperDetails extends Developer {
    @Override
    public void coding() {
        System.out.println("Overridden: coding in DeveloperDetails");
    }

    @Override
    public void debugging() {
        System.out.println("Overridden: debugging in DeveloperDetails");
    }

    @Override
    public void testing() {
        System.out.println("Overridden: testing in DeveloperDetails");
    }

    @Override
    public void collaboration() {
        System.out.println("Overridden: collaboration in DeveloperDetails");
    }

    @Override
    public void deployment() {
        System.out.println("Overridden: deployment in DeveloperDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in DeveloperDetails");
    }
}
