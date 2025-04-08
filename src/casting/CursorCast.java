package casting;

public class CursorCast {
    public void cast(Cursor cursor) {
        System.out.println("Casting Cursor");
        cursor.type();
        cursor.movement();
        cursor.function();
        cursor.customization();
        cursor.appearance();
        if(cursor instanceof CursorDetails) {
            CursorDetails ref = (CursorDetails)cursor;
            ref.extraMethod();
        }
    }
}
