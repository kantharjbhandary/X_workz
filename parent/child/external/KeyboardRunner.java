package parent.child.external;

import parent.child.internal.GamingKeyboard;
import parent.child.internal.Keyboard;

public class KeyboardRunner {

        public static void main(String[] args) {
            Keyboard keyboard = new Keyboard();
            keyboard.type();
            keyboard.connectivity();
            keyboard.backlight();
            keyboard.keys();
            keyboard.brand();

            System.out.println("-------------------------");

            GamingKeyboard gamingKeyboard = new GamingKeyboard();
            gamingKeyboard.type();
            gamingKeyboard.connectivity();
            gamingKeyboard.backlight();
            gamingKeyboard.keys();
            gamingKeyboard.brand();

            System.out.println("-------------------------");

            Keyboard keyboard1 = new GamingKeyboard();
            keyboard1.type();
            keyboard1.connectivity();
            keyboard1.backlight();
            keyboard1.keys();
            keyboard1.brand();
        }

}
