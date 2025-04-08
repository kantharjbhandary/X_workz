package casting;

public class FisheriesCast {
    public void cast(Fisheries fisheries) {
        System.out.println("Casting Fisheries");
        fisheries.aquaculture();
        fisheries.marine();
        fisheries.freshwater();
        fisheries.breeding();
        fisheries.economy();
        if(fisheries instanceof FisheriesDetails) {
            FisheriesDetails ref = (FisheriesDetails)fisheries;
            ref.extraMethod();
        }
    }
}
