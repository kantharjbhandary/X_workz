package casting;

public class TimeRunner {
    public static void main(String[] args) {

        Time time = new Time();
        time.measurement();
        time.concept();
        time.zones();
        time.relativity();
        time.importance();
        System.out.println("----------------------");

        Time timePoly = new TimeDetails();
        timePoly.measurement();
        timePoly.concept();
        timePoly.zones();
        timePoly.relativity();
        timePoly.importance();
        System.out.println("----------------------");

        TimeDetails timeDetails = new TimeDetails();
        timeDetails.measurement();
        timeDetails.concept();
        timeDetails.zones();
        timeDetails.relativity();
        timeDetails.importance();
        timeDetails.extraMethod();
        System.out.println("----------------------");

        TimeCast timeCast = new TimeCast();
        timeCast.cast(timePoly);
    }
}
