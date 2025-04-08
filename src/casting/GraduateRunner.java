package casting;

public class GraduateRunner {
    public static void main(String[] args) {

        Graduate graduate = new Graduate();
        graduate.educationLevel();
        graduate.degree();
        graduate.employment();
        graduate.skills();
        graduate.futureScope();
        System.out.println("----------------------");

        Graduate graduatePoly = new GraduateDetails();
        graduatePoly.educationLevel();
        graduatePoly.degree();
        graduatePoly.employment();
        graduatePoly.skills();
        graduatePoly.futureScope();
        System.out.println("----------------------");

        GraduateDetails graduateDetails = new GraduateDetails();
        graduateDetails.educationLevel();
        graduateDetails.degree();
        graduateDetails.employment();
        graduateDetails.skills();
        graduateDetails.futureScope();
        graduateDetails.extraMethod();
        System.out.println("----------------------");

        GraduateCast graduateCast = new GraduateCast();
        graduateCast.cast(graduatePoly);
    }
}
