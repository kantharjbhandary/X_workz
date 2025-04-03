package parent.child.external;

import parent.child.internal.PharmaceuticalScience;
import parent.child.internal.Pharmacy;

public class PharmacyRunner {

        public static void main(String[] args) {
            PharmaceuticalScience pharmaceuticalScience = new PharmaceuticalScience();
            pharmaceuticalScience.study();
            pharmaceuticalScience.branches();
            pharmaceuticalScience.impact();
            pharmaceuticalScience.regulation();
            pharmaceuticalScience.careers();

            System.out.println("-------------------------");

            Pharmacy pharmacy = new Pharmacy();
            pharmacy.study();
            pharmacy.branches();
            pharmacy.impact();
            pharmacy.regulation();
            pharmacy.careers();

            System.out.println("-------------------------");

            PharmaceuticalScience pharmaceuticalScience1 = new Pharmacy();
            pharmaceuticalScience1.study();
            pharmaceuticalScience1.branches();
            pharmaceuticalScience1.impact();
            pharmaceuticalScience1.regulation();
            pharmaceuticalScience1.careers();
        }


}
