package parent.child.external;

import parent.child.internal.BackendDeveloper;
import parent.child.internal.Coder;

public class CoderRunner {

        public static void main(String[] args) {
            Coder coder = new Coder();
            coder.programmingLanguages();
            coder.algorithms();
            coder.softwareDevelopment();
            coder.problemSolving();
            coder.learning();

            System.out.println("-------------------------");

            BackendDeveloper backendDeveloper = new BackendDeveloper();
            backendDeveloper.programmingLanguages();
            backendDeveloper.algorithms();
            backendDeveloper.softwareDevelopment();
            backendDeveloper.problemSolving();
            backendDeveloper.learning();

            System.out.println("-------------------------");

            Coder coder1 = new BackendDeveloper();
            coder1.programmingLanguages();
            coder1.algorithms();
            coder1.softwareDevelopment();
            coder1.problemSolving();
            coder1.learning();
        }

}
