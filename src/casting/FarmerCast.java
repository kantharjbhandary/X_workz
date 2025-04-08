package casting;

public class FarmerCast {
    public void cast(Farmer farmer) {
        System.out.println("Casting Farmer");
        farmer.crops();
        farmer.irrigation();
        farmer.livestock();
        farmer.equipment();
        farmer.market();
        if(farmer instanceof FarmerDetails) {
            FarmerDetails ref = (FarmerDetails)farmer;
            ref.extraMethod();
        }
    }
}
