package casting;

public class FestivalDetails extends Festival {
    @Override
    public void name() {
        System.out.println("Overridden: name in FestivalDetails");
    }

    @Override
    public void culture() {
        System.out.println("Overridden: culture in FestivalDetails");
    }

    @Override
    public void celebrationType() {
        System.out.println("Overridden: celebrationType in FestivalDetails");
    }

    @Override
    public void publicHoliday() {
        System.out.println("Overridden: publicHoliday in FestivalDetails");
    }

    @Override
    public void foodSpecialties() {
        System.out.println("Overridden: foodSpecialties in FestivalDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in FestivalDetails");
    }
}
