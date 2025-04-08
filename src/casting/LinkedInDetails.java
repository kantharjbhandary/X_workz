package casting;

public class LinkedInDetails extends LinkedIn {
    @Override
    public void connections() {
        System.out.println("Overridden: connections in LinkedInDetails");
    }

    @Override
    public void jobs() {
        System.out.println("Overridden: jobs in LinkedInDetails");
    }

    @Override
    public void articles() {
        System.out.println("Overridden: articles in LinkedInDetails");
    }

    @Override
    public void endorsements() {
        System.out.println("Overridden: endorsements in LinkedInDetails");
    }

    @Override
    public void messages() {
        System.out.println("Overridden: messages in LinkedInDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in LinkedInDetails");
    }
}
