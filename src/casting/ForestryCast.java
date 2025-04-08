package casting;

public class ForestryCast {
    public void cast(Forestry forestry) {
        System.out.println("Casting Forestry");
        forestry.conservation();
        forestry.timber();
        forestry.biodiversity();
        forestry.afforestation();
        forestry.economy();
        if(forestry instanceof ForestryDetails) {
            ForestryDetails ref = (ForestryDetails)forestry;
            ref.extraMethod();
        }
    }
}
