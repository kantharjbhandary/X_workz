package casting;

public class HospitalCast {
    public void cast(Hospital hospital) {
        System.out.println("Casting Hospital");
        hospital.departments();
        hospital.staff();
        hospital.facilities();
        hospital.emergency();
        hospital.location();
        if(hospital instanceof HospitalDetails) {
            HospitalDetails ref = (HospitalDetails)hospital;
            ref.extraMethod();
        }
    }
}
