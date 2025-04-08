package casting;

public class CookCast {
    public void cast(Cook cook) {
        System.out.println("Casting Cook");
        cook.skills();
        cook.ingredients();
        cook.methods();
        cook.cuisine();
        cook.tools();
        if(cook instanceof CookDetails) {
            CookDetails ref = (CookDetails)cook;
            ref.extraMethod();
        }
    }
}
