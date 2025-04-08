package casting;

public class CricketDetails extends Cricket {
    @Override
    public void totalRuns() {
        System.out.println("Overridden: totalRuns in CricketDetails");
    }

    @Override
    public void totalWickets() {
        System.out.println("Overridden: totalWickets in CricketDetails");
    }

    @Override
    public void matchLocation() {
        System.out.println("Overridden: matchLocation in CricketDetails");
    }

    @Override
    public void matchTime() {
        System.out.println("Overridden: matchTime in CricketDetails");
    }

    @Override
    public void sponsers() {
        System.out.println("Overridden: sponsers in CricketDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in CricketDetails");
    }
}
