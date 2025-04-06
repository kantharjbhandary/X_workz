package parent.child.internal;

public class LeadActor extends Actor {
    public LeadActor() {
        System.out.println("Running no-arg constructor in LeadActor");
    }
    @Override
    public void name() { System.out.println("Actors have different name"); }
    public void experience() { System.out.println("Actors have different experience"); }
    public void awards() { System.out.println("Actors wins awards"); }
    public void nationality() { System.out.println("they belong to different nationalities"); }
    public void filmography() { System.out.println("they have a variety of films in their filmography"); }
}