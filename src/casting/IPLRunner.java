package casting;

public class IPLRunner {
    public static void main(String[] args) {

        IPL iPL = new IPL();
        iPL.teams();
        iPL.format();
        iPL.schedule();
        iPL.sponsors();
        iPL.popularity();
        System.out.println("----------------------");

        IPL iPLPoly = new IPLDetails();
        iPLPoly.teams();
        iPLPoly.format();
        iPLPoly.schedule();
        iPLPoly.sponsors();
        iPLPoly.popularity();
        System.out.println("----------------------");

        IPLDetails iPLDetails = new IPLDetails();
        iPLDetails.teams();
        iPLDetails.format();
        iPLDetails.schedule();
        iPLDetails.sponsors();
        iPLDetails.popularity();
        iPLDetails.extraMethod();
        System.out.println("----------------------");

        IPLCast iPLCast = new IPLCast();
        iPLCast.cast(iPLPoly);
    }
}
