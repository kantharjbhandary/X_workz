package casting;

public class AgricultureDetails extends Agriculture {
    @Override
    public void crops() {
        System.out.println("Overridden: crops in AgricultureDetails");
    }

    @Override
    public void irrigation() {
        System.out.println("Overridden: irrigation in AgricultureDetails");
    }

    @Override
    public void machinery() {
        System.out.println("Overridden: machinery in AgricultureDetails");
    }

    @Override
    public void fertilizers() {
        System.out.println("Overridden: fertilizers in AgricultureDetails");
    }

    @Override
    public void economy() {
        System.out.println("Overridden: economy in AgricultureDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in AgricultureDetails");
    }
}
