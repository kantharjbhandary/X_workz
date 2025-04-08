package casting;

public class InstitutionDetails extends Institution {
    @Override
    public void education() {
        System.out.println("Overridden: education in InstitutionDetails");
    }

    @Override
    public void types() {
        System.out.println("Overridden: types in InstitutionDetails");
    }

    @Override
    public void accreditation() {
        System.out.println("Overridden: accreditation in InstitutionDetails");
    }

    @Override
    public void facilities() {
        System.out.println("Overridden: facilities in InstitutionDetails");
    }

    @Override
    public void importance() {
        System.out.println("Overridden: importance in InstitutionDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in InstitutionDetails");
    }
}
