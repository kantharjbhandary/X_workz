package casting;

public class AvengersRunner {
    public static void main(String[] args) {

        Avengers avengers = new Avengers();
        avengers.members();
        avengers.mission();
        avengers.enemies();
        avengers.leader();
        avengers.popularity();
        System.out.println("----------------------");

        Avengers avengersPoly = new AvengersDetails();
        avengersPoly.members();
        avengersPoly.mission();
        avengersPoly.enemies();
        avengersPoly.leader();
        avengersPoly.popularity();
        System.out.println("----------------------");

        AvengersDetails avengersDetails = new AvengersDetails();
        avengersDetails.members();
        avengersDetails.mission();
        avengersDetails.enemies();
        avengersDetails.leader();
        avengersDetails.popularity();
        avengersDetails.extraMethod();
        System.out.println("----------------------");

        AvengersCast avengersCast = new AvengersCast();
        avengersCast.cast(avengersPoly);
    }
}
