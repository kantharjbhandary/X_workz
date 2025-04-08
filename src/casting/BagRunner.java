package casting;

public class BagRunner {
    public static void main(String[] args) {

        Bag bag = new Bag();
        bag.carryItems();
        bag.materialType();
        bag.size();
        bag.durability();
        bag.compartments();
        System.out.println("----------------------");

        Bag bagPoly = new BagDetails();
        bagPoly.carryItems();
        bagPoly.materialType();
        bagPoly.size();
        bagPoly.durability();
        bagPoly.compartments();
        System.out.println("----------------------");

        BagDetails bagDetails = new BagDetails();
        bagDetails.carryItems();
        bagDetails.materialType();
        bagDetails.size();
        bagDetails.durability();
        bagDetails.compartments();
        bagDetails.extraMethod();
        System.out.println("----------------------");

        BagCast bagCast = new BagCast();
        bagCast.cast(bagPoly);
    }
}
