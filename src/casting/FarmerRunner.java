package casting;

public class FarmerRunner {
    public static void main(String[] args) {

        Farmer farmer = new Farmer();
        farmer.crops();
        farmer.irrigation();
        farmer.livestock();
        farmer.equipment();
        farmer.market();
        System.out.println("----------------------");

        Farmer farmerPoly = new FarmerDetails();
        farmerPoly.crops();
        farmerPoly.irrigation();
        farmerPoly.livestock();
        farmerPoly.equipment();
        farmerPoly.market();
        System.out.println("----------------------");

        FarmerDetails farmerDetails = new FarmerDetails();
        farmerDetails.crops();
        farmerDetails.irrigation();
        farmerDetails.livestock();
        farmerDetails.equipment();
        farmerDetails.market();
        farmerDetails.extraMethod();
        System.out.println("----------------------");

        FarmerCast farmerCast = new FarmerCast();
        farmerCast.cast(farmerPoly);
    }
}
