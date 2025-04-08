package casting;

public class WorkDetails extends Work {
    @Override
    public void type() {
        System.out.println("Overridden: type in WorkDetails");
    }

    @Override
    public void environment() {
        System.out.println("Overridden: environment in WorkDetails");
    }

    @Override
    public void salary() {
        System.out.println("Overridden: salary in WorkDetails");
    }

    @Override
    public void industry() {
        System.out.println("Overridden: industry in WorkDetails");
    }

    @Override
    public void hours() {
        System.out.println("Overridden: hours in WorkDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in WorkDetails");
    }
}
