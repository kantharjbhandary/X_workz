package casting;

public class WorkerCast {
    public void cast(Worker worker) {
        System.out.println("Casting Worker");
        worker.profession();
        worker.skills();
        worker.workingHours();
        worker.salary();
        worker.workplace();
        if(worker instanceof WorkerDetails) {
            WorkerDetails ref = (WorkerDetails)worker;
            ref.extraMethod();
        }
    }
}
