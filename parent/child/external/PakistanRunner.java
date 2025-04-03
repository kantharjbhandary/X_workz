package parent.child.external;

import parent.child.internal.Karachi;
import parent.child.internal.Pakistan;

public class PakistanRunner {
        public static void main(String[] args) {
            Pakistan pakistan = new Pakistan();
            pakistan.geography();
            pakistan.capital();
            pakistan.language();
            pakistan.economy();
            pakistan.culture();

            System.out.println("-------------------------");

            Karachi karachi = new Karachi();
            karachi.geography();
            karachi.capital();
            karachi.language();
            karachi.economy();
            karachi.culture();

            System.out.println("-------------------------");

            Pakistan pakistan1 = new Karachi();
            pakistan1.geography();
            pakistan1.capital();
            pakistan1.language();
            pakistan1.economy();
            pakistan1.culture();
        }
    }

