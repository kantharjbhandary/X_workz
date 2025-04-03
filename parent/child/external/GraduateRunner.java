package parent.child.external;

import parent.child.internal.Graduate;
import parent.child.internal.PostGraduate;

public class GraduateRunner {

        public static void main(String[] args) {
            Graduate graduate = new Graduate();
            graduate.educationLevel();
            graduate.degree();
            graduate.employment();
            graduate.skills();
            graduate.futureScope();

            System.out.println("-------------------------");

            PostGraduate postGraduate = new PostGraduate();
            postGraduate.educationLevel();
            postGraduate.degree();
            postGraduate.employment();
            postGraduate.skills();
            postGraduate.futureScope();

            System.out.println("-------------------------");

            Graduate graduate1 = new PostGraduate();
            graduate1.educationLevel();
            graduate1.degree();
            graduate1.employment();
            graduate1.skills();
            graduate1.futureScope();

    }

}
