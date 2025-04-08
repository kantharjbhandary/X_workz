package casting;

public class ClothDetails extends Cloth {
    @Override
    public void material() {
        System.out.println("Overridden: material in ClothDetails");
    }

    @Override
    public void cost() {
        System.out.println("Overridden: cost in ClothDetails");
    }

    @Override
    public void durability() {
        System.out.println("Overridden: durability in ClothDetails");
    }

    @Override
    public void warrenty() {
        System.out.println("Overridden: warrenty in ClothDetails");
    }

    @Override
    public void size() {
        System.out.println("Overridden: size in ClothDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in ClothDetails");
    }
}
