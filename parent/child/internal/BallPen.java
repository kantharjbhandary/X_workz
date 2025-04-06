package parent.child.internal;

public class BallPen extends Pen {
    public BallPen() {
        System.out.println("Running no-arg constructor in BallPen");
    }
    @Override
    public void inkType() { System.out.println("they use different types of ink"); }
    public void color() { System.out.println("they come in different colors"); }
    public void brand() { System.out.println("they are available from various brands"); }
    public void usage() { System.out.println("they are used for writing and drawing"); }
    public void durability() { System.out.println("they have varying durability"); }
}
