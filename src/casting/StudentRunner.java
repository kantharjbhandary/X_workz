package casting;

public class StudentRunner {
    public static void main(String[] args) {

        Student student = new Student();
        student.study();
        student.exams();
        student.assignments();
        student.participation();
        student.learningMode();
        System.out.println("----------------------");

        Student studentPoly = new StudentDetails();
        studentPoly.study();
        studentPoly.exams();
        studentPoly.assignments();
        studentPoly.participation();
        studentPoly.learningMode();
        System.out.println("----------------------");

        StudentDetails studentDetails = new StudentDetails();
        studentDetails.study();
        studentDetails.exams();
        studentDetails.assignments();
        studentDetails.participation();
        studentDetails.learningMode();
        studentDetails.extraMethod();
        System.out.println("----------------------");

        StudentCast studentCast = new StudentCast();
        studentCast.cast(studentPoly);
    }
}
