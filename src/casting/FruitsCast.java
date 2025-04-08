package casting;

public class FruitsCast {
    public void cast(Fruits fruits) {
        System.out.println("Casting Fruits");
        fruits.totalVarieties();
        fruits.commonFruits();
        fruits.bestSeason();
        fruits.nutrition();
        fruits.popularBrands();
        if(fruits instanceof FruitsDetails) {
            FruitsDetails ref = (FruitsDetails)fruits;
            ref.extraMethod();
        }
    }
}
