package casting;

public class FisheriesRunner {
    public static void main(String[] args) {

        Fisheries fisheries = new Fisheries();
        fisheries.aquaculture();
        fisheries.marine();
        fisheries.freshwater();
        fisheries.breeding();
        fisheries.economy();
        System.out.println("----------------------");

        Fisheries fisheriesPoly = new FisheriesDetails();
        fisheriesPoly.aquaculture();
        fisheriesPoly.marine();
        fisheriesPoly.freshwater();
        fisheriesPoly.breeding();
        fisheriesPoly.economy();
        System.out.println("----------------------");

        FisheriesDetails fisheriesDetails = new FisheriesDetails();
        fisheriesDetails.aquaculture();
        fisheriesDetails.marine();
        fisheriesDetails.freshwater();
        fisheriesDetails.breeding();
        fisheriesDetails.economy();
        fisheriesDetails.extraMethod();
        System.out.println("----------------------");

        FisheriesCast fisheriesCast = new FisheriesCast();
        fisheriesCast.cast(fisheriesPoly);
    }
}
