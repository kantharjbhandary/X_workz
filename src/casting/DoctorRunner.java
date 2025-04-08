package casting;

public class DoctorRunner {
    public static void main(String[] args) {

        Doctor doctor = new Doctor();
        doctor.specialization();
        doctor.diagnosis();
        doctor.treatment();
        doctor.experience();
        doctor.hospitalAffiliation();
        System.out.println("----------------------");

        Doctor doctorPoly = new DoctorDetails();
        doctorPoly.specialization();
        doctorPoly.diagnosis();
        doctorPoly.treatment();
        doctorPoly.experience();
        doctorPoly.hospitalAffiliation();
        System.out.println("----------------------");

        DoctorDetails doctorDetails = new DoctorDetails();
        doctorDetails.specialization();
        doctorDetails.diagnosis();
        doctorDetails.treatment();
        doctorDetails.experience();
        doctorDetails.hospitalAffiliation();
        doctorDetails.extraMethod();
        System.out.println("----------------------");

        DoctorCast doctorCast = new DoctorCast();
        doctorCast.cast(doctorPoly);
    }
}
