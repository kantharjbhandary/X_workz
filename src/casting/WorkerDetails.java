package casting;

public class WorkerDetails extends Worker {
    @Override
    public void profession() {
        System.out.println("Overridden: profession in WorkerDetails");
    }

    @Override
    public void skills() {
        System.out.println("Overridden: skills in WorkerDetails");
    }

    @Override
    public void workingHours() {
        System.out.println("Overridden: workingHours in WorkerDetails");
    }

    @Override
    public void salary() {
        System.out.println("Overridden: salary in WorkerDetails");
    }

    @Override
    public void workplace() {
        System.out.println("Overridden: workplace in WorkerDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in WorkerDetails");
    }
}
