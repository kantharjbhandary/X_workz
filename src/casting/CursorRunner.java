package casting;

public class CursorRunner {
    public static void main(String[] args) {

        Cursor cursor = new Cursor();
        cursor.type();
        cursor.movement();
        cursor.function();
        cursor.customization();
        cursor.appearance();
        System.out.println("----------------------");

        Cursor cursorPoly = new CursorDetails();
        cursorPoly.type();
        cursorPoly.movement();
        cursorPoly.function();
        cursorPoly.customization();
        cursorPoly.appearance();
        System.out.println("----------------------");

        CursorDetails cursorDetails = new CursorDetails();
        cursorDetails.type();
        cursorDetails.movement();
        cursorDetails.function();
        cursorDetails.customization();
        cursorDetails.appearance();
        cursorDetails.extraMethod();
        System.out.println("----------------------");

        CursorCast cursorCast = new CursorCast();
        cursorCast.cast(cursorPoly);
    }
}
