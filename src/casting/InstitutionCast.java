package casting;

public class InstitutionCast {
    public void cast(Institution institution) {
        System.out.println("Casting Institution");
        institution.education();
        institution.types();
        institution.accreditation();
        institution.facilities();
        institution.importance();
        if(institution instanceof InstitutionDetails) {
            InstitutionDetails ref = (InstitutionDetails)institution;
            ref.extraMethod();
        }
    }
}
