package casting;

public class CricketRunner {
    public static void main(String[] args) {

        Cricket cricket = new Cricket();
        cricket.totalRuns();
        cricket.totalWickets();
        cricket.matchLocation();
        cricket.matchTime();
        cricket.sponsers();
        System.out.println("----------------------");

        Cricket cricketPoly = new CricketDetails();
        cricketPoly.totalRuns();
        cricketPoly.totalWickets();
        cricketPoly.matchLocation();
        cricketPoly.matchTime();
        cricketPoly.sponsers();
        System.out.println("----------------------");

        CricketDetails cricketDetails = new CricketDetails();
        cricketDetails.totalRuns();
        cricketDetails.totalWickets();
        cricketDetails.matchLocation();
        cricketDetails.matchTime();
        cricketDetails.sponsers();
        cricketDetails.extraMethod();
        System.out.println("----------------------");

        CricketCast cricketCast = new CricketCast();
        cricketCast.cast(cricketPoly);
    }
}
