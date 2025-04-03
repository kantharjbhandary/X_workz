package parent.child.external;

import parent.child.internal.Email;
import parent.child.internal.Letters;

public class LetterRunner {

        public static void main(String[] args) {
            Letters letters = new Letters();
            letters.communication();
            letters.types();
            letters.format();
            letters.medium();
            letters.importance();

            System.out.println("-------------------------");

            Email email = new Email();
            email.communication();
            email.types();
            email.format();
            email.medium();
            email.importance();

            System.out.println("-------------------------");

            Letters letters1 = new Email();
            letters1.communication();
            letters1.types();
            letters1.format();
            letters1.medium();
            letters1.importance();
        }
    }

