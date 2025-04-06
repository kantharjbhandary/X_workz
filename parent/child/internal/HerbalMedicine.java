package parent.child.internal;
public class HerbalMedicine extends Ayurveda {
    public HerbalMedicine() {
        System.out.println("Running no-arg constructor in HerbalMedicine");
    }
    @Override
    public void origin() { System.out.println("Ay originated in ancient India."); }
    public void treatments() { System.out.println( "natural herbs for healing."); }
    public void principles() { System.out.println(" on balancing body, mind, and spirit."); }
    public void therapies() { System.out.println("Inc Panchakarma, herbal remedies, and yoga."); }
    public void globalReach() { System.out.println("Ayu is gaining global recognition."); }

}