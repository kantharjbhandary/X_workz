package casting;

public class GraduateCast {
    public void cast(Graduate graduate) {
        System.out.println("Casting Graduate");
        graduate.educationLevel();
        graduate.degree();
        graduate.employment();
        graduate.skills();
        graduate.futureScope();
        if(graduate instanceof GraduateDetails) {
            GraduateDetails ref = (GraduateDetails)graduate;
            ref.extraMethod();
        }
    }
}
