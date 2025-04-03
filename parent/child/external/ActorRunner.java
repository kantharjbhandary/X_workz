package parent.child.external;

import parent.child.internal.Actor;
import parent.child.internal.LeadActor;

public class ActorRunner {
    public static void main(String[] args) {
        Actor actor = new Actor();
        actor.name();
        actor.experience();
        actor.awards();
        actor.nationality();
        actor.filmography();

        System.out.println("-------------------------");


        LeadActor leadActor = new LeadActor();
        leadActor.name();
        leadActor.experience();
        leadActor.awards();
        leadActor.nationality();
        leadActor.filmography();

        System.out.println("-------------------------");


        Actor actor1 = new LeadActor();
        actor1.name();
        actor1.experience();
        actor1.awards();
        actor1.nationality();
        actor1.filmography();
    }
}