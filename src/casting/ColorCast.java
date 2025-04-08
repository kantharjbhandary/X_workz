package casting;

public class ColorCast {
    public void cast(Color color) {
        System.out.println("Casting Color");
        color.shades();
        color.hexCode();
        color.usage();
        color.perception();
        color.contrast();
        if(color instanceof ColorDetails) {
            ColorDetails ref = (ColorDetails)color;
            ref.extraMethod();
        }
    }
}
