package casting;

public class CursorDetails extends Cursor {
    @Override
    public void type() {
        System.out.println("Overridden: type in CursorDetails");
    }

    @Override
    public void movement() {
        System.out.println("Overridden: movement in CursorDetails");
    }

    @Override
    public void function() {
        System.out.println("Overridden: function in CursorDetails");
    }

    @Override
    public void customization() {
        System.out.println("Overridden: customization in CursorDetails");
    }

    @Override
    public void appearance() {
        System.out.println("Overridden: appearance in CursorDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in CursorDetails");
    }
}
