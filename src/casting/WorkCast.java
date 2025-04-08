package casting;

public class WorkCast {
    public void cast(Work work) {
        System.out.println("Casting Work");
        work.type();
        work.environment();
        work.salary();
        work.industry();
        work.hours();
        if(work instanceof WorkDetails) {
            WorkDetails ref = (WorkDetails)work;
            ref.extraMethod();
        }
    }
}
