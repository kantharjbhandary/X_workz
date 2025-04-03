package parent.child.external;

import parent.child.internal.Hospital;
import parent.child.internal.PrivateHospital;

public class HospitalRunner {

        public static void main(String[] args) {
            Hospital hospital = new Hospital();
            hospital.departments();
            hospital.staff();
            hospital.facilities();
            hospital.emergency();
            hospital.location();

            System.out.println("-------------------------");

            PrivateHospital privateHospital = new PrivateHospital();
            privateHospital.departments();
            privateHospital.staff();
            privateHospital.facilities();
            privateHospital.emergency();
            privateHospital.location();

            System.out.println("-------------------------");

            Hospital hospital1 = new PrivateHospital();
            hospital1.departments();
            hospital1.staff();
            hospital1.facilities();
            hospital1.emergency();
            hospital1.location();

    }

}
