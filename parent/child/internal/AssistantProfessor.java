package parent.child.internal;

public class AssistantProfessor extends Professor {
    public AssistantProfessor() {
        System.out.println("Running no-arg constructor in AssistantProfessor");
    }
    @Override
    public void subject() { System.out.println("Professors specialize in various subjects.."); }
    public void research() { System.out.println("Professors conduct research and form"); }
    public void teaching() { System.out.println("Professors teach students in higher education institutions ..."); }
    public void publications() { System.out.println("Professors publish academic papers..."); }
    public void mentoring() { System.out.println("Professors mentor students and junior faculty.."); }
}

