package parent.child.external;

import parent.child.internal.Doctor;
import parent.child.internal.Surgeon;

public class DoctorRunner {
        public static void main(String[] args) {
            Doctor doctor = new Doctor();
            doctor.specialization();
            doctor.diagnosis();
            doctor.treatment();
            doctor.experience();
            doctor.hospitalAffiliation();

            System.out.println("-------------------------");

            Surgeon surgeon = new Surgeon();
            surgeon.specialization();
            surgeon.diagnosis();
            surgeon.treatment();
            surgeon.experience();
            surgeon.hospitalAffiliation();

            System.out.println("-------------------------");

            Doctor doctor1 = new Surgeon();
            doctor1.specialization();
            doctor1.diagnosis();
            doctor1.treatment();
            doctor1.experience();
            doctor1.hospitalAffiliation();
        }
    }

