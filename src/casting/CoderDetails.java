package casting;

public class CoderDetails extends Coder {
    @Override
    public void programmingLanguages() {
        System.out.println("Overridden: programmingLanguages in CoderDetails");
    }

    @Override
    public void algorithms() {
        System.out.println("Overridden: algorithms in CoderDetails");
    }

    @Override
    public void softwareDevelopment() {
        System.out.println("Overridden: softwareDevelopment in CoderDetails");
    }

    @Override
    public void problemSolving() {
        System.out.println("Overridden: problemSolving in CoderDetails");
    }

    @Override
    public void learning() {
        System.out.println("Overridden: learning in CoderDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in CoderDetails");
    }
}
