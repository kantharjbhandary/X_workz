package parent.child.external;

import parent.child.internal.Medical;
import parent.child.internal.Surgery;

public class MedicalRunner {
        public static void main(String[] args) {
            Medical medical = new Medical();
            medical.study();
            medical.specialization();
            medical.professionals();
            medical.treatments();
            medical.research();

            System.out.println("-------------------------");

            Surgery surgery = new Surgery();
            surgery.study();
            surgery.specialization();
            surgery.professionals();
            surgery.treatments();
            surgery.research();

            System.out.println("-------------------------");

            Medical medical1 = new Surgery();
            medical1.study();
            medical1.specialization();
            medical1.professionals();
            medical1.treatments();
            medical1.research();
        }

}
