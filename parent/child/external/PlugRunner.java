package parent.child.external;

import parent.child.internal.Plug;
import parent.child.internal.SmartPlug;

public class PlugRunner {
        public static void main(String[] args) {
            Plug plug = new Plug();
            plug.function();
            plug.types();
            plug.safety();
            plug.material();
            plug.voltage();

            System.out.println("-------------------------");

            SmartPlug smartPlug = new SmartPlug();
            smartPlug.function();
            smartPlug.types();
            smartPlug.safety();
            smartPlug.material();
            smartPlug.voltage();

            System.out.println("-------------------------");

            Plug plug1 = new SmartPlug();
            plug1.function();
            plug1.types();
            plug1.safety();
            plug1.material();
            plug1.voltage();
        }
    }

