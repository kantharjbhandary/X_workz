package parent.child.internal;
public class IronMan extends Avengers {
    public IronMan() {
        System.out.println("Running no-arg constructor in IronMan");
    }
    @Override
    public void members() { System.out.println("They have various members"); }
    public void mission() { System.out.println("They protect the world"); }
    public void enemies() { System.out.println("They fight powerful enemies"); }
    public void leader() { System.out.println("They are led by different heroes"); }
    public void popularity() { System.out.println("They are popular worldwide"); }
}
