package casting;

public class WaterRunner {
    public static void main(String[] args) {

        Water water = new Water();
        water.necessity();
        water.sources();
        water.states();
        water.purification();
        water.usage();
        System.out.println("----------------------");

        Water waterPoly = new WaterDetails();
        waterPoly.necessity();
        waterPoly.sources();
        waterPoly.states();
        waterPoly.purification();
        waterPoly.usage();
        System.out.println("----------------------");

        WaterDetails waterDetails = new WaterDetails();
        waterDetails.necessity();
        waterDetails.sources();
        waterDetails.states();
        waterDetails.purification();
        waterDetails.usage();
        waterDetails.extraMethod();
        System.out.println("----------------------");

        WaterCast waterCast = new WaterCast();
        waterCast.cast(waterPoly);
    }
}
