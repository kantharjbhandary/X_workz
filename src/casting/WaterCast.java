package casting;

public class WaterCast {
    public void cast(Water water) {
        System.out.println("Casting Water");
        water.necessity();
        water.sources();
        water.states();
        water.purification();
        water.usage();
        if(water instanceof WaterDetails) {
            WaterDetails ref = (WaterDetails)water;
            ref.extraMethod();
        }
    }
}
