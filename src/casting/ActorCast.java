package casting;

public class ActorCast {
    public void cast(Actor actor) {
        System.out.println("Casting Actor");
        actor.name();
        actor.experience();
        actor.awards();
        actor.nationality();
        actor.filmography();
        if(actor instanceof ActorDetails) {
            ActorDetails ref = (ActorDetails)actor;
            ref.extraMethod();
        }
    }
}
