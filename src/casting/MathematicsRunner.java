package casting;

public class MathematicsRunner {
    public static void main(String[] args) {

        Mathematics mathematics = new Mathematics();
        mathematics.study();
        mathematics.branches();
        mathematics.applications();
        mathematics.problemSolving();
        mathematics.famousMathematicians();
        System.out.println("----------------------");

        Mathematics mathematicsPoly = new MathematicsDetails();
        mathematicsPoly.study();
        mathematicsPoly.branches();
        mathematicsPoly.applications();
        mathematicsPoly.problemSolving();
        mathematicsPoly.famousMathematicians();
        System.out.println("----------------------");

        MathematicsDetails mathematicsDetails = new MathematicsDetails();
        mathematicsDetails.study();
        mathematicsDetails.branches();
        mathematicsDetails.applications();
        mathematicsDetails.problemSolving();
        mathematicsDetails.famousMathematicians();
        mathematicsDetails.extraMethod();
        System.out.println("----------------------");

        MathematicsCast mathematicsCast = new MathematicsCast();
        mathematicsCast.cast(mathematicsPoly);
    }
}
