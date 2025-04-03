package parent.child.external;

import parent.child.internal.Education;
import parent.child.internal.HigherEducation;

public class EducationRunner {

        public static void main(String[] args) {
            Education education = new Education();
            education.levels();
            education.mode();
            education.importance();
            education.specialization();
            education.assessment();

            System.out.println("-------------------------");

            HigherEducation higherEducation = new HigherEducation();
            higherEducation.levels();
            higherEducation.mode();
            higherEducation.importance();
            higherEducation.specialization();
            higherEducation.assessment();

            System.out.println("-------------------------");

            Education education1 = new HigherEducation();
            education1.levels();
            education1.mode();
            education1.importance();
            education1.specialization();
            education1.assessment();
        }
    }

