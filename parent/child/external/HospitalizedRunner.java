package parent.child.external;

import parent.child.internal.HospitalizedPatient;
import parent.child.internal.Patient;

public class HospitalizedRunner {


        public static void main(String[] args) {
            Patient patient = new Patient();
            patient.symptoms();
            patient.treatment();
            patient.recovery();
            patient.medication();
            patient.consultation();

            System.out.println("-------------------------");

            HospitalizedPatient hospitalizedPatient = new HospitalizedPatient();
            hospitalizedPatient.symptoms();
            hospitalizedPatient.treatment();
            hospitalizedPatient.recovery();
            hospitalizedPatient.medication();
            hospitalizedPatient.consultation();

            System.out.println("-------------------------");

            Patient patient1 = new HospitalizedPatient();
            patient1.symptoms();
            patient1.treatment();
            patient1.recovery();
            patient1.medication();
            patient1.consultation();
        }
    }

