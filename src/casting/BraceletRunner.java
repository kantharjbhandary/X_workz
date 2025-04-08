package casting;

public class BraceletRunner {
    public static void main(String[] args) {

        Bracelet bracelet = new Bracelet();
        bracelet.material();
        bracelet.design();
        bracelet.usage();
        bracelet.history();
        bracelet.price();
        System.out.println("----------------------");

        Bracelet braceletPoly = new BraceletDetails();
        braceletPoly.material();
        braceletPoly.design();
        braceletPoly.usage();
        braceletPoly.history();
        braceletPoly.price();
        System.out.println("----------------------");

        BraceletDetails braceletDetails = new BraceletDetails();
        braceletDetails.material();
        braceletDetails.design();
        braceletDetails.usage();
        braceletDetails.history();
        braceletDetails.price();
        braceletDetails.extraMethod();
        System.out.println("----------------------");

        BraceletCast braceletCast = new BraceletCast();
        braceletCast.cast(braceletPoly);
    }
}
