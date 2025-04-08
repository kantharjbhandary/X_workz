package casting;

public class BottleRunner {
    public static void main(String[] args) {

        Bottle bottle = new Bottle();
        bottle.material();
        bottle.capacity();
        bottle.usage();
        bottle.brands();
        bottle.design();
        System.out.println("----------------------");

        Bottle bottlePoly = new BottleDetails();
        bottlePoly.material();
        bottlePoly.capacity();
        bottlePoly.usage();
        bottlePoly.brands();
        bottlePoly.design();
        System.out.println("----------------------");

        BottleDetails bottleDetails = new BottleDetails();
        bottleDetails.material();
        bottleDetails.capacity();
        bottleDetails.usage();
        bottleDetails.brands();
        bottleDetails.design();
        bottleDetails.extraMethod();
        System.out.println("----------------------");

        BottleCast bottleCast = new BottleCast();
        bottleCast.cast(bottlePoly);
    }
}
