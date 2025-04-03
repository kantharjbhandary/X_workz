package parent.child.external;

import parent.child.internal.LightSwitch;
import parent.child.internal.Switch;

public class SwitchRunner {
        public static void main(String[] args) {
            Switch sw = new Switch();
            sw.type();
            sw.function();
            sw.design();
            sw.durability();
            sw.brands();

            System.out.println("-------------------------");

            LightSwitch lightSwitch = new LightSwitch();
            lightSwitch.type();
            lightSwitch.function();
            lightSwitch.design();
            lightSwitch.durability();
            lightSwitch.brands();

            System.out.println("-------------------------");

            Switch sw1 = new LightSwitch();
            sw1.type();
            sw1.function();
            sw1.design();
            sw1.durability();
            sw1.brands();
        }
    }

