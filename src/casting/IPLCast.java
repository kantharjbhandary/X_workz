package casting;

public class IPLCast {
    public void cast(IPL iPL) {
        System.out.println("Casting IPL");
        iPL.teams();
        iPL.format();
        iPL.schedule();
        iPL.sponsors();
        iPL.popularity();
        if(iPL instanceof IPLDetails) {
            IPLDetails ref = (IPLDetails)iPL;
            ref.extraMethod();
        }
    }
}
