package casting;

public class KeyboardDetails extends Keyboard {
    @Override
    public void type() {
        System.out.println("Overridden: type in KeyboardDetails");
    }

    @Override
    public void connectivity() {
        System.out.println("Overridden: connectivity in KeyboardDetails");
    }

    @Override
    public void backlight() {
        System.out.println("Overridden: backlight in KeyboardDetails");
    }

    @Override
    public void keys() {
        System.out.println("Overridden: keys in KeyboardDetails");
    }

    @Override
    public void brand() {
        System.out.println("Overridden: brand in KeyboardDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in KeyboardDetails");
    }
}
