package casting;

public class ClothRunner {
    public static void main(String[] args) {

        Cloth cloth = new Cloth();
        cloth.material();
        cloth.cost();
        cloth.durability();
        cloth.warrenty();
        cloth.size();
        System.out.println("----------------------");

        Cloth clothPoly = new ClothDetails();
        clothPoly.material();
        clothPoly.cost();
        clothPoly.durability();
        clothPoly.warrenty();
        clothPoly.size();
        System.out.println("----------------------");

        ClothDetails clothDetails = new ClothDetails();
        clothDetails.material();
        clothDetails.cost();
        clothDetails.durability();
        clothDetails.warrenty();
        clothDetails.size();
        clothDetails.extraMethod();
        System.out.println("----------------------");

        ClothCast clothCast = new ClothCast();
        clothCast.cast(clothPoly);
    }
}
