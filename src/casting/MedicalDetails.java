package casting;

public class MedicalDetails extends Medical {
    @Override
    public void study() {
        System.out.println("Overridden: study in MedicalDetails");
    }

    @Override
    public void specialization() {
        System.out.println("Overridden: specialization in MedicalDetails");
    }

    @Override
    public void professionals() {
        System.out.println("Overridden: professionals in MedicalDetails");
    }

    @Override
    public void treatments() {
        System.out.println("Overridden: treatments in MedicalDetails");
    }

    @Override
    public void research() {
        System.out.println("Overridden: research in MedicalDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in MedicalDetails");
    }
}
