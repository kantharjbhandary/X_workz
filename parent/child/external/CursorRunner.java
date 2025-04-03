package parent.child.external;

import parent.child.internal.Cursor;
import parent.child.internal.TextCursor;

public class CursorRunner {
        public static void main(String[] args) {
            Cursor cursor = new Cursor();
            cursor.type();
            cursor.movement();
            cursor.function();
            cursor.customization();
            cursor.appearance();

            System.out.println("-------------------------");

            TextCursor textCursor = new TextCursor();
            textCursor.type();
            textCursor.movement();
            textCursor.function();
            textCursor.customization();
            textCursor.appearance();

            System.out.println("-------------------------");

            Cursor cursor1 = new TextCursor();
            cursor1.type();
            cursor1.movement();
            cursor1.function();
            cursor1.customization();
            cursor1.appearance();
        }
    }

