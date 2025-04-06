package parent.child.internal;

public class RightAngle extends Angle {
    public RightAngle() {
        System.out.println("Running no-arg constructor in RightAngle");
    }
    @Override
    public void measurement() { System.out.println("Angles are measured in degrees or radians and more"); }
    public void types() { System.out.println("Angles can be acute, obtuse, or right angle"); }
    public void usage() { System.out.println("Angles are used in geometry and physics .."); }
    public void calculation() { System.out.println("Angles can be calculated using mathematical trigonometry"); }
    public void properties() { System.out.println("Angles follow specific mathematical property.."); }
}