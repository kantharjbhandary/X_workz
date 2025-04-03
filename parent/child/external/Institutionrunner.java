package parent.child.external;

import parent.child.internal.Institution;
import parent.child.internal.University;

public class Institutionrunner {

        public static void main(String[] args) {
            Institution institution = new Institution();
            institution.education();
            institution.types();
            institution.accreditation();
            institution.facilities();
            institution.importance();

            System.out.println("-------------------------");

            University university = new University();
            university.education();
            university.types();
            university.accreditation();
            university.facilities();
            university.importance();

            System.out.println("-------------------------");

            Institution institution1 = new University();
            institution1.education();
            institution1.types();
            institution1.accreditation();
            institution1.facilities();
            institution1.importance();
        }


}
