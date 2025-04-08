package casting;

public class GraduateDetails extends Graduate {
    @Override
    public void educationLevel() {
        System.out.println("Overridden: educationLevel in GraduateDetails");
    }

    @Override
    public void degree() {
        System.out.println("Overridden: degree in GraduateDetails");
    }

    @Override
    public void employment() {
        System.out.println("Overridden: employment in GraduateDetails");
    }

    @Override
    public void skills() {
        System.out.println("Overridden: skills in GraduateDetails");
    }

    @Override
    public void futureScope() {
        System.out.println("Overridden: futureScope in GraduateDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in GraduateDetails");
    }
}
