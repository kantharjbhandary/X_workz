package casting;

public class ColorRunner {
    public static void main(String[] args) {

        Color color = new Color();
        color.shades();
        color.hexCode();
        color.usage();
        color.perception();
        color.contrast();
        System.out.println("----------------------");

        Color colorPoly = new ColorDetails();
        colorPoly.shades();
        colorPoly.hexCode();
        colorPoly.usage();
        colorPoly.perception();
        colorPoly.contrast();
        System.out.println("----------------------");

        ColorDetails colorDetails = new ColorDetails();
        colorDetails.shades();
        colorDetails.hexCode();
        colorDetails.usage();
        colorDetails.perception();
        colorDetails.contrast();
        colorDetails.extraMethod();
        System.out.println("----------------------");

        ColorCast colorCast = new ColorCast();
        colorCast.cast(colorPoly);
    }
}
