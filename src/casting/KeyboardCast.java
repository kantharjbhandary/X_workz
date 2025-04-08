package casting;

public class KeyboardCast {
    public void cast(Keyboard keyboard) {
        System.out.println("Casting Keyboard");
        keyboard.type();
        keyboard.connectivity();
        keyboard.backlight();
        keyboard.keys();
        keyboard.brand();
        if(keyboard instanceof KeyboardDetails) {
            KeyboardDetails ref = (KeyboardDetails)keyboard;
            ref.extraMethod();
        }
    }
}
