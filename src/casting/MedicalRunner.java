package casting;

public class MedicalRunner {
    public static void main(String[] args) {

        Medical medical = new Medical();
        medical.study();
        medical.specialization();
        medical.professionals();
        medical.treatments();
        medical.research();
        System.out.println("----------------------");

        Medical medicalPoly = new MedicalDetails();
        medicalPoly.study();
        medicalPoly.specialization();
        medicalPoly.professionals();
        medicalPoly.treatments();
        medicalPoly.research();
        System.out.println("----------------------");

        MedicalDetails medicalDetails = new MedicalDetails();
        medicalDetails.study();
        medicalDetails.specialization();
        medicalDetails.professionals();
        medicalDetails.treatments();
        medicalDetails.research();
        medicalDetails.extraMethod();
        System.out.println("----------------------");

        MedicalCast medicalCast = new MedicalCast();
        medicalCast.cast(medicalPoly);
    }
}
