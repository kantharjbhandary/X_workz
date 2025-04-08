package casting;

public class GodCast {
    public void cast(God god) {
        System.out.println("Casting God");
        god.worship();
        god.teachings();
        god.temples();
        god.faith();
        god.festivals();
        if(god instanceof GodDetails) {
            GodDetails ref = (GodDetails)god;
            ref.extraMethod();
        }
    }
}
