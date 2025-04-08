package casting;

public class MedicalCast {
    public void cast(Medical medical) {
        System.out.println("Casting Medical");
        medical.study();
        medical.specialization();
        medical.professionals();
        medical.treatments();
        medical.research();
        if(medical instanceof MedicalDetails) {
            MedicalDetails ref = (MedicalDetails)medical;
            ref.extraMethod();
        }
    }
}
