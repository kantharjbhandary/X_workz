package casting;

public class KeyboardRunner {
    public static void main(String[] args) {

        Keyboard keyboard = new Keyboard();
        keyboard.type();
        keyboard.connectivity();
        keyboard.backlight();
        keyboard.keys();
        keyboard.brand();
        System.out.println("----------------------");

        Keyboard keyboardPoly = new KeyboardDetails();
        keyboardPoly.type();
        keyboardPoly.connectivity();
        keyboardPoly.backlight();
        keyboardPoly.keys();
        keyboardPoly.brand();
        System.out.println("----------------------");

        KeyboardDetails keyboardDetails = new KeyboardDetails();
        keyboardDetails.type();
        keyboardDetails.connectivity();
        keyboardDetails.backlight();
        keyboardDetails.keys();
        keyboardDetails.brand();
        keyboardDetails.extraMethod();
        System.out.println("----------------------");

        KeyboardCast keyboardCast = new KeyboardCast();
        keyboardCast.cast(keyboardPoly);
    }
}
