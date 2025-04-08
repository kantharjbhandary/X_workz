package casting;

public class AvengersCast {
    public void cast(Avengers avengers) {
        System.out.println("Casting Avengers");
        avengers.members();
        avengers.mission();
        avengers.enemies();
        avengers.leader();
        avengers.popularity();
        if(avengers instanceof AvengersDetails) {
            AvengersDetails ref = (AvengersDetails)avengers;
            ref.extraMethod();
        }
    }
}
