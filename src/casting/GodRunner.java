package casting;

public class GodRunner {
    public static void main(String[] args) {

        God god = new God();
        god.worship();
        god.teachings();
        god.temples();
        god.faith();
        god.festivals();
        System.out.println("----------------------");

        God godPoly = new GodDetails();
        godPoly.worship();
        godPoly.teachings();
        godPoly.temples();
        godPoly.faith();
        godPoly.festivals();
        System.out.println("----------------------");

        GodDetails godDetails = new GodDetails();
        godDetails.worship();
        godDetails.teachings();
        godDetails.temples();
        godDetails.faith();
        godDetails.festivals();
        godDetails.extraMethod();
        System.out.println("----------------------");

        GodCast godCast = new GodCast();
        godCast.cast(godPoly);
    }
}
