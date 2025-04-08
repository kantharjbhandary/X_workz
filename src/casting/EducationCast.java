package casting;

public class EducationCast {
    public void cast(Education education) {
        System.out.println("Casting Education");
        education.levels();
        education.mode();
        education.importance();
        education.specialization();
        education.assessment();
        if(education instanceof EducationDetails) {
            EducationDetails ref = (EducationDetails)education;
            ref.extraMethod();
        }
    }
}
