package casting;

public class WatchRunner {
    public static void main(String[] args) {

        Watch watch = new Watch();
        watch.brand();
        watch.type();
        watch.material();
        watch.waterproof();
        watch.priceRange();
        System.out.println("----------------------");

        Watch watchPoly = new WatchDetails();
        watchPoly.brand();
        watchPoly.type();
        watchPoly.material();
        watchPoly.waterproof();
        watchPoly.priceRange();
        System.out.println("----------------------");

        WatchDetails watchDetails = new WatchDetails();
        watchDetails.brand();
        watchDetails.type();
        watchDetails.material();
        watchDetails.waterproof();
        watchDetails.priceRange();
        watchDetails.extraMethod();
        System.out.println("----------------------");

        WatchCast watchCast = new WatchCast();
        watchCast.cast(watchPoly);
    }
}
