package casting;

public class ClothCast {
    public void cast(Cloth cloth) {
        System.out.println("Casting Cloth");
        cloth.material();
        cloth.cost();
        cloth.durability();
        cloth.warrenty();
        cloth.size();
        if(cloth instanceof ClothDetails) {
            ClothDetails ref = (ClothDetails)cloth;
            ref.extraMethod();
        }
    }
}
