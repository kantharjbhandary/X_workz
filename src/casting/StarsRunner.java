package casting;

public class StarsRunner {
    public static void main(String[] args) {

        Stars stars = new Stars();
        stars.brightness();
        stars.size();
        stars.composition();
        stars.lifecycle();
        stars.constellations();
        System.out.println("----------------------");

        Stars starsPoly = new StarsDetails();
        starsPoly.brightness();
        starsPoly.size();
        starsPoly.composition();
        starsPoly.lifecycle();
        starsPoly.constellations();
        System.out.println("----------------------");

        StarsDetails starsDetails = new StarsDetails();
        starsDetails.brightness();
        starsDetails.size();
        starsDetails.composition();
        starsDetails.lifecycle();
        starsDetails.constellations();
        starsDetails.extraMethod();
        System.out.println("----------------------");

        StarsCast starsCast = new StarsCast();
        starsCast.cast(starsPoly);
    }
}
