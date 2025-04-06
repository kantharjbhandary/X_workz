package parent.child.internal;


public class DairyFarming extends AnimalHusbandry {
    public DairyFarming() {
        System.out.println("Running no-arg constructor in DairyFarming");
    }
    @Override
    public void livestock() { System.out.println("Animal husbandry deals with livestocks.."); }
    public void dairy() { System.out.println("Milk production is a key aspects of money "); }
    public void poultry() { System.out.println("Poultry farming is a part of this field.."); }
    public void breeding() { System.out.println("Selective breeding improves productivity in india"); }
    public void economy() { System.out.println("Animal husbandry contributes to the economy powered"); }
}