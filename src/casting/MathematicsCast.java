package casting;

public class MathematicsCast {
    public void cast(Mathematics mathematics) {
        System.out.println("Casting Mathematics");
        mathematics.study();
        mathematics.branches();
        mathematics.applications();
        mathematics.problemSolving();
        mathematics.famousMathematicians();
        if(mathematics instanceof MathematicsDetails) {
            MathematicsDetails ref = (MathematicsDetails)mathematics;
            ref.extraMethod();
        }
    }
}
