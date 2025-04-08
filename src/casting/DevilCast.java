package casting;

public class DevilCast {
    public void cast(Devil devil) {
        System.out.println("Casting Devil");
        devil.evil();
        devil.trickery();
        devil.darkness();
        devil.myths();
        devil.fear();
        if(devil instanceof DevilDetails) {
            DevilDetails ref = (DevilDetails)devil;
            ref.extraMethod();
        }
    }
}
