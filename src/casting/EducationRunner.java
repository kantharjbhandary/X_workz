package casting;

public class EducationRunner {
    public static void main(String[] args) {

        Education education = new Education();
        education.levels();
        education.mode();
        education.importance();
        education.specialization();
        education.assessment();
        System.out.println("----------------------");

        Education educationPoly = new EducationDetails();
        educationPoly.levels();
        educationPoly.mode();
        educationPoly.importance();
        educationPoly.specialization();
        educationPoly.assessment();
        System.out.println("----------------------");

        EducationDetails educationDetails = new EducationDetails();
        educationDetails.levels();
        educationDetails.mode();
        educationDetails.importance();
        educationDetails.specialization();
        educationDetails.assessment();
        educationDetails.extraMethod();
        System.out.println("----------------------");

        EducationCast educationCast = new EducationCast();
        educationCast.cast(educationPoly);
    }
}
