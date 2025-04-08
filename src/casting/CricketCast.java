package casting;

public class CricketCast {
    public void cast(Cricket cricket) {
        System.out.println("Casting Cricket");
        cricket.totalRuns();
        cricket.totalWickets();
        cricket.matchLocation();
        cricket.matchTime();
        cricket.sponsers();
        if(cricket instanceof CricketDetails) {
            CricketDetails ref = (CricketDetails)cricket;
            ref.extraMethod();
        }
    }
}
