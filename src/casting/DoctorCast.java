package casting;

public class DoctorCast {
    public void cast(Doctor doctor) {
        System.out.println("Casting Doctor");
        doctor.specialization();
        doctor.diagnosis();
        doctor.treatment();
        doctor.experience();
        doctor.hospitalAffiliation();
        if(doctor instanceof DoctorDetails) {
            DoctorDetails ref = (DoctorDetails)doctor;
            ref.extraMethod();
        }
    }
}
