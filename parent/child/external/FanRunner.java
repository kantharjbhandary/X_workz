package parent.child.external;

import parent.child.internal.CeliningFan;
import parent.child.internal.Fan;

public class FanRunner {
        public static void main(String[] args) {
            Fan fan = new Fan();
            fan.function();
            fan.types();
            fan.powerSource();
            fan.speedControl();
            fan.energyConsumption();

            System.out.println("-------------------------");

            CeliningFan ceilingFan = new CeliningFan();
            ceilingFan.function();
            ceilingFan.types();
            ceilingFan.powerSource();
            ceilingFan.speedControl();
            ceilingFan.energyConsumption();

            System.out.println("-------------------------");

            Fan fan1 = new CeliningFan();
            fan1.function();
            fan1.types();
            fan1.powerSource();
            fan1.speedControl();
            fan1.energyConsumption();
        }
    }

