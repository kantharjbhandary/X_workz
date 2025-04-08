package casting;

public class MathematicsDetails extends Mathematics {
    @Override
    public void study() {
        System.out.println("Overridden: study in MathematicsDetails");
    }

    @Override
    public void branches() {
        System.out.println("Overridden: branches in MathematicsDetails");
    }

    @Override
    public void applications() {
        System.out.println("Overridden: applications in MathematicsDetails");
    }

    @Override
    public void problemSolving() {
        System.out.println("Overridden: problemSolving in MathematicsDetails");
    }

    @Override
    public void famousMathematicians() {
        System.out.println("Overridden: famousMathematicians in MathematicsDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in MathematicsDetails");
    }
}
