package parent.child.external;

import parent.child.internal.DrinkingWater;
import parent.child.internal.Water;

public class WaterRunner {
        public static void main(String[] args) {
            Water water = new Water();
            water.necessity();
            water.sources();
            water.states();
            water.purification();
            water.usage();

            System.out.println("-------------------------");

            DrinkingWater drinkingWater = new DrinkingWater();
            drinkingWater.necessity();
            drinkingWater.sources();
            drinkingWater.states();
            drinkingWater.purification();
            drinkingWater.usage();

            System.out.println("-------------------------");

            Water water1 = new DrinkingWater();
            water1.necessity();
            water1.sources();
            water1.states();
            water1.purification();
            water1.usage();
        }
    }

