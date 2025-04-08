package casting;

public class InstitutionRunner {
    public static void main(String[] args) {

        Institution institution = new Institution();
        institution.education();
        institution.types();
        institution.accreditation();
        institution.facilities();
        institution.importance();
        System.out.println("----------------------");

        Institution institutionPoly = new InstitutionDetails();
        institutionPoly.education();
        institutionPoly.types();
        institutionPoly.accreditation();
        institutionPoly.facilities();
        institutionPoly.importance();
        System.out.println("----------------------");

        InstitutionDetails institutionDetails = new InstitutionDetails();
        institutionDetails.education();
        institutionDetails.types();
        institutionDetails.accreditation();
        institutionDetails.facilities();
        institutionDetails.importance();
        institutionDetails.extraMethod();
        System.out.println("----------------------");

        InstitutionCast institutionCast = new InstitutionCast();
        institutionCast.cast(institutionPoly);
    }
}
