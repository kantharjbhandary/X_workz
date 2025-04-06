package parent.child.internal;
public class Agroforestry extends Forestry {
    public Agroforestry() {
        System.out.println("Running no-arg constructor in Agroforestry");
    }
    @Override
    public void conservation() { System.out.println("Forestry focused on conservation"); }
    @Override
    public void timber() { System.out.println("Forestry provides money throgh timber"); }
    @Override
    public void biodiversity() { System.out.println("Forests maintain  well biodiversity"); }
    @Override
    public void afforestation() { System.out.println("Afforestation is got promoted"); }
    @Override
    public void economy() { System.out.println("Forestry has economically significance"); }
}