package casting;

public class WorkRunner {
    public static void main(String[] args) {

        Work work = new Work();
        work.type();
        work.environment();
        work.salary();
        work.industry();
        work.hours();
        System.out.println("----------------------");

        Work workPoly = new WorkDetails();
        workPoly.type();
        workPoly.environment();
        workPoly.salary();
        workPoly.industry();
        workPoly.hours();
        System.out.println("----------------------");

        WorkDetails workDetails = new WorkDetails();
        workDetails.type();
        workDetails.environment();
        workDetails.salary();
        workDetails.industry();
        workDetails.hours();
        workDetails.extraMethod();
        System.out.println("----------------------");

        WorkCast workCast = new WorkCast();
        workCast.cast(workPoly);
    }
}
