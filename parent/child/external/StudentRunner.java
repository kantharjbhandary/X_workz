package parent.child.external;

import parent.child.internal.CollegeStudent;
import parent.child.internal.Student;

public class StudentRunner {
        public static void main(String[] args) {
            Student student = new Student();
            student.study();
            student.exams();
            student.assignments();
            student.participation();
            student.learningMode();

            System.out.println("-------------------------");

            CollegeStudent collegeStudent = new CollegeStudent();
            collegeStudent.study();
            collegeStudent.exams();
            collegeStudent.assignments();
            collegeStudent.participation();
            collegeStudent.learningMode();

            System.out.println("-------------------------");

            Student student1 = new CollegeStudent();
            student1.study();
            student1.exams();
            student1.assignments();
            student1.participation();
            student1.learningMode();
        }
    }

