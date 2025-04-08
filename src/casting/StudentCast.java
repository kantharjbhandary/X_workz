package casting;

public class StudentCast {
    public void cast(Student student) {
        System.out.println("Casting Student");
        student.study();
        student.exams();
        student.assignments();
        student.participation();
        student.learningMode();
        if(student instanceof StudentDetails) {
            StudentDetails ref = (StudentDetails)student;
            ref.extraMethod();
        }
    }
}
