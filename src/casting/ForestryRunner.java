package casting;

public class ForestryRunner {
    public static void main(String[] args) {

        Forestry forestry = new Forestry();
        forestry.conservation();
        forestry.timber();
        forestry.biodiversity();
        forestry.afforestation();
        forestry.economy();
        System.out.println("----------------------");

        Forestry forestryPoly = new ForestryDetails();
        forestryPoly.conservation();
        forestryPoly.timber();
        forestryPoly.biodiversity();
        forestryPoly.afforestation();
        forestryPoly.economy();
        System.out.println("----------------------");

        ForestryDetails forestryDetails = new ForestryDetails();
        forestryDetails.conservation();
        forestryDetails.timber();
        forestryDetails.biodiversity();
        forestryDetails.afforestation();
        forestryDetails.economy();
        forestryDetails.extraMethod();
        System.out.println("----------------------");

        ForestryCast forestryCast = new ForestryCast();
        forestryCast.cast(forestryPoly);
    }
}
