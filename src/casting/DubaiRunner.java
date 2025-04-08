package casting;

public class DubaiRunner {
    public static void main(String[] args) {

        Dubai dubai = new Dubai();
        dubai.tourism();
        dubai.economy();
        dubai.architecture();
        dubai.climate();
        dubai.culture();
        System.out.println("----------------------");

        Dubai dubaiPoly = new DubaiDetails();
        dubaiPoly.tourism();
        dubaiPoly.economy();
        dubaiPoly.architecture();
        dubaiPoly.climate();
        dubaiPoly.culture();
        System.out.println("----------------------");

        DubaiDetails dubaiDetails = new DubaiDetails();
        dubaiDetails.tourism();
        dubaiDetails.economy();
        dubaiDetails.architecture();
        dubaiDetails.climate();
        dubaiDetails.culture();
        dubaiDetails.extraMethod();
        System.out.println("----------------------");

        DubaiCast dubaiCast = new DubaiCast();
        dubaiCast.cast(dubaiPoly);
    }
}
