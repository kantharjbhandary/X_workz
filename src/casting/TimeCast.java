package casting;

public class TimeCast {
    public void cast(Time time) {
        System.out.println("Casting Time");
        time.measurement();
        time.concept();
        time.zones();
        time.relativity();
        time.importance();
        if(time instanceof TimeDetails) {
            TimeDetails ref = (TimeDetails)time;
            ref.extraMethod();
        }
    }
}
