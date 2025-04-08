package casting;

public class WorkerRunner {
    public static void main(String[] args) {

        Worker worker = new Worker();
        worker.profession();
        worker.skills();
        worker.workingHours();
        worker.salary();
        worker.workplace();
        System.out.println("----------------------");

        Worker workerPoly = new WorkerDetails();
        workerPoly.profession();
        workerPoly.skills();
        workerPoly.workingHours();
        workerPoly.salary();
        workerPoly.workplace();
        System.out.println("----------------------");

        WorkerDetails workerDetails = new WorkerDetails();
        workerDetails.profession();
        workerDetails.skills();
        workerDetails.workingHours();
        workerDetails.salary();
        workerDetails.workplace();
        workerDetails.extraMethod();
        System.out.println("----------------------");

        WorkerCast workerCast = new WorkerCast();
        workerCast.cast(workerPoly);
    }
}
