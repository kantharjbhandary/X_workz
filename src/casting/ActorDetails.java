package casting;

public class ActorDetails extends Actor {
    @Override
    public void name() {
        System.out.println("Overridden: name in ActorDetails");
    }

    @Override
    public void experience() {
        System.out.println("Overridden: experience in ActorDetails");
    }

    @Override
    public void awards() {
        System.out.println("Overridden: awards in ActorDetails");
    }

    @Override
    public void nationality() {
        System.out.println("Overridden: nationality in ActorDetails");
    }

    @Override
    public void filmography() {
        System.out.println("Overridden: filmography in ActorDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in ActorDetails");
    }
}
