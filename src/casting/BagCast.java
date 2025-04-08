package casting;

public class BagCast {
    public void cast(Bag bag) {
        System.out.println("Casting Bag");
        bag.carryItems();
        bag.materialType();
        bag.size();
        bag.durability();
        bag.compartments();
        if(bag instanceof BagDetails) {
            BagDetails ref = (BagDetails)bag;
            ref.extraMethod();
        }
    }
}
