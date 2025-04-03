package parent.child.external;

import parent.child.internal.Ayurveda;
import parent.child.internal.HerbalMedicine;

public class AyurvedaRunner {

        public static void main(String[] args) {
            Ayurveda ayurveda = new Ayurveda();
            ayurveda.origin();
            ayurveda.treatments();
            ayurveda.principles();
            ayurveda.therapies();
            ayurveda.globalReach();

            System.out.println("-------------------------");

            HerbalMedicine herbalMedicine = new HerbalMedicine();
            herbalMedicine.origin();
            herbalMedicine.treatments();
            herbalMedicine.principles();
            herbalMedicine.therapies();
            herbalMedicine.globalReach();

            System.out.println("-------------------------");

            Ayurveda ayurveda1 = new HerbalMedicine();
            ayurveda1.origin();
            ayurveda1.treatments();
            ayurveda1.principles();
            ayurveda1.therapies();
            ayurveda1.globalReach();
        }

}
