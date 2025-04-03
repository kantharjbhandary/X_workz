package parent.child.internal;

public class Patient {
    public Patient() {
        System.out.println("Running no-arg constructor in Patient");
    }
    public void symptoms() { System.out.println("Patients exhibit different symptoms"); }
    public void treatment() { System.out.println("Patients receive treatment"); }
    public void recovery() { System.out.println("Patients undergo a recovery process"); }
    public void medication() { System.out.println("Patients take prescribed medication"); }
    public void consultation() { System.out.println("Patients consult with doctors"); }
}
