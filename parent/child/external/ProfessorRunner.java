package parent.child.external;

import parent.child.internal.AssistantProfessor;
import parent.child.internal.Professor;

public class ProfessorRunner {

        public static void main(String[] args) {
            Professor professor = new Professor();
            professor.subject();
            professor.research();
            professor.teaching();
            professor.publications();
            professor.mentoring();

            System.out.println("-------------------------");

            AssistantProfessor assistantProfessor = new AssistantProfessor();
            assistantProfessor.subject();
            assistantProfessor.research();
            assistantProfessor.teaching();
            assistantProfessor.publications();
            assistantProfessor.mentoring();

            System.out.println("-------------------------");

            Professor professor1 = new AssistantProfessor();
            professor1.subject();
            professor1.research();
            professor1.teaching();
            professor1.publications();
            professor1.mentoring();
        }


}
