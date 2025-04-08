package casting;

public class StudentDetails extends Student {
    @Override
    public void study() {
        System.out.println("Overridden: study in StudentDetails");
    }

    @Override
    public void exams() {
        System.out.println("Overridden: exams in StudentDetails");
    }

    @Override
    public void assignments() {
        System.out.println("Overridden: assignments in StudentDetails");
    }

    @Override
    public void participation() {
        System.out.println("Overridden: participation in StudentDetails");
    }

    @Override
    public void learningMode() {
        System.out.println("Overridden: learningMode in StudentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in StudentDetails");
    }
}
