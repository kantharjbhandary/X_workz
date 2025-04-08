package casting;

public class EducationDetails extends Education {
    @Override
    public void levels() {
        System.out.println("Overridden: levels in EducationDetails");
    }

    @Override
    public void mode() {
        System.out.println("Overridden: mode in EducationDetails");
    }

    @Override
    public void importance() {
        System.out.println("Overridden: importance in EducationDetails");
    }

    @Override
    public void specialization() {
        System.out.println("Overridden: specialization in EducationDetails");
    }

    @Override
    public void assessment() {
        System.out.println("Overridden: assessment in EducationDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in EducationDetails");
    }
}
