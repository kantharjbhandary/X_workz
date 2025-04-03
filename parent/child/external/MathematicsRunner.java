package parent.child.external;

import parent.child.internal.Algebra;
import parent.child.internal.Mathematics;

public class MathematicsRunner{
    public static void main(String[] args) {
        Mathematics mathematics = new Mathematics();
        mathematics.study();
        mathematics.branches();
        mathematics.applications();
        mathematics.problemSolving();
        mathematics.famousMathematicians();

        System.out.println("-------------------------");

        Algebra algebra = new Algebra();
        algebra.study();
        algebra.branches();
        algebra.applications();
        algebra.problemSolving();
        algebra.famousMathematicians();

        System.out.println("-------------------------");

        Mathematics mathematics1 = new Algebra();
        mathematics1.study();
        mathematics1.branches();
        mathematics1.applications();
        mathematics1.problemSolving();
        mathematics1.famousMathematicians();
    }
}

