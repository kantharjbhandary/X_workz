package parent.child.external;

import parent.child.internal.BrightColor;
import parent.child.internal.Color;

public class ColorRunner {

        public static void main(String[] args) {
            Color color = new Color();
            color.shades();
            color.hexCode();
            color.usage();
            color.perception();
            color.contrast();

            System.out.println("-------------------------");

            BrightColor brightColor = new BrightColor();
            brightColor.shades();
            brightColor.hexCode();
            brightColor.usage();
            brightColor.perception();
            brightColor.contrast();

            System.out.println("-------------------------");

            Color color1 = new BrightColor();
            color1.shades();
            color1.hexCode();
            color1.usage();
            color1.perception();
            color1.contrast();
        }
    }

