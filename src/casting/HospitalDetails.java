package casting;

public class HospitalDetails extends Hospital {
    @Override
    public void departments() {
        System.out.println("Overridden: departments in HospitalDetails");
    }

    @Override
    public void staff() {
        System.out.println("Overridden: staff in HospitalDetails");
    }

    @Override
    public void facilities() {
        System.out.println("Overridden: facilities in HospitalDetails");
    }

    @Override
    public void emergency() {
        System.out.println("Overridden: emergency in HospitalDetails");
    }

    @Override
    public void location() {
        System.out.println("Overridden: location in HospitalDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in HospitalDetails");
    }
}
