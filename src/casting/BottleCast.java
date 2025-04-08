package casting;

public class BottleCast {
    public void cast(Bottle bottle) {
        System.out.println("Casting Bottle");
        bottle.material();
        bottle.capacity();
        bottle.usage();
        bottle.brands();
        bottle.design();
        if(bottle instanceof BottleDetails) {
            BottleDetails ref = (BottleDetails)bottle;
            ref.extraMethod();
        }
    }
}
