package casting;

public class DevilRunner {
    public static void main(String[] args) {

        Devil devil = new Devil();
        devil.evil();
        devil.trickery();
        devil.darkness();
        devil.myths();
        devil.fear();
        System.out.println("----------------------");

        Devil devilPoly = new DevilDetails();
        devilPoly.evil();
        devilPoly.trickery();
        devilPoly.darkness();
        devilPoly.myths();
        devilPoly.fear();
        System.out.println("----------------------");

        DevilDetails devilDetails = new DevilDetails();
        devilDetails.evil();
        devilDetails.trickery();
        devilDetails.darkness();
        devilDetails.myths();
        devilDetails.fear();
        devilDetails.extraMethod();
        System.out.println("----------------------");

        DevilCast devilCast = new DevilCast();
        devilCast.cast(devilPoly);
    }
}
