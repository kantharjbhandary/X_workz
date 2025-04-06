package parent.child.internal;

public class HairStylist extends Barber {
    public HairStylist() {
        System.out.println("Running no-arg constructor in HairStylist");
    }

    @Override

    public void haircut() {
        System.out.println(" THe   Barbers provide different types of haircuts");
    }

    public void shaving() {
        System.out.println(" THe   Barbers offer shaving services");
    }

    public void styling() {
        System.out.println(" THe   Barbers help in hair styling");
    }

    public void products() {
        System.out.println(" THe   Barbers use various hair care products");
    }

    public void tools() {
        System.out.println(" THe   Barbers use scissors, trimmers, and razors");
    }
}