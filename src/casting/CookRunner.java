package casting;

public class CookRunner {
    public static void main(String[] args) {

        Cook cook = new Cook();
        cook.skills();
        cook.ingredients();
        cook.methods();
        cook.cuisine();
        cook.tools();
        System.out.println("----------------------");

        Cook cookPoly = new CookDetails();
        cookPoly.skills();
        cookPoly.ingredients();
        cookPoly.methods();
        cookPoly.cuisine();
        cookPoly.tools();
        System.out.println("----------------------");

        CookDetails cookDetails = new CookDetails();
        cookDetails.skills();
        cookDetails.ingredients();
        cookDetails.methods();
        cookDetails.cuisine();
        cookDetails.tools();
        cookDetails.extraMethod();
        System.out.println("----------------------");

        CookCast cookCast = new CookCast();
        cookCast.cast(cookPoly);
    }
}
