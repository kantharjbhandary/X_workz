package parent.child.external;

import parent.child.internal.Paint;
import parent.child.internal.WallPaint;

public class PaintingRunner {
        public static void main(String[] args) {
            Paint paint = new Paint();
            paint.types();
            paint.colors();
            paint.application();
            paint.durability();
            paint.brand();

            System.out.println("-------------------------");

            WallPaint wallPaint = new WallPaint();
            wallPaint.types();
            wallPaint.colors();
            wallPaint.application();
            wallPaint.durability();
            wallPaint.brand();

            System.out.println("-------------------------");

            Paint paint1 = new WallPaint();
            paint1.types();
            paint1.colors();
            paint1.application();
            paint1.durability();
            paint1.brand();
        }
    }
