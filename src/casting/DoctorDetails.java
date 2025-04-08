package casting;

public class DoctorDetails extends Doctor {
    @Override
    public void specialization() {
        System.out.println("Overridden: specialization in DoctorDetails");
    }

    @Override
    public void diagnosis() {
        System.out.println("Overridden: diagnosis in DoctorDetails");
    }

    @Override
    public void treatment() {
        System.out.println("Overridden: treatment in DoctorDetails");
    }

    @Override
    public void experience() {
        System.out.println("Overridden: experience in DoctorDetails");
    }

    @Override
    public void hospitalAffiliation() {
        System.out.println("Overridden: hospitalAffiliation in DoctorDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in DoctorDetails");
    }
}
