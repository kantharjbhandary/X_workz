package casting;

public class ActorRunner {
    public static void main(String[] args) {

        Actor actor = new Actor();
        actor.name();
        actor.experience();
        actor.awards();
        actor.nationality();
        actor.filmography();
        System.out.println("----------------------");

        Actor actorPoly = new ActorDetails();
        actorPoly.name();
        actorPoly.experience();
        actorPoly.awards();
        actorPoly.nationality();
        actorPoly.filmography();
        System.out.println("----------------------");

        ActorDetails actorDetails = new ActorDetails();
        actorDetails.name();
        actorDetails.experience();
        actorDetails.awards();
        actorDetails.nationality();
        actorDetails.filmography();
        actorDetails.extraMethod();
        System.out.println("----------------------");

        ActorCast actorCast = new ActorCast();
        actorCast.cast(actorPoly);
    }
}
