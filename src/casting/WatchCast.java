package casting;

public class WatchCast {
    public void cast(Watch watch) {
        System.out.println("Casting Watch");
        watch.brand();
        watch.type();
        watch.material();
        watch.waterproof();
        watch.priceRange();
        if(watch instanceof WatchDetails) {
            WatchDetails ref = (WatchDetails)watch;
            ref.extraMethod();
        }
    }
}
