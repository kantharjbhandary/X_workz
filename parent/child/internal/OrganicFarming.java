package parent.child.internal;

public class OrganicFarming extends Agriculture {
    public OrganicFarming() {
        System.out.println("Running no-arg constructor in OrganicFarming");
    }
    public void crops() { System.out.println("Agriculture involves growing different crop"); }
    public void irrigation() { System.out.println("Irrigation is essential in farming"); }
    public void machinery() { System.out.println("Various machines are available"); }
    public void fertilizers() { System.out.println("Fertilizers improve soil quality"); }
    public void economy() { System.out.println("improved economy"); }
}