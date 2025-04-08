package casting;

public class FruitsRunner {
    public static void main(String[] args) {

        Fruits fruits = new Fruits();
        fruits.totalVarieties();
        fruits.commonFruits();
        fruits.bestSeason();
        fruits.nutrition();
        fruits.popularBrands();
        System.out.println("----------------------");

        Fruits fruitsPoly = new FruitsDetails();
        fruitsPoly.totalVarieties();
        fruitsPoly.commonFruits();
        fruitsPoly.bestSeason();
        fruitsPoly.nutrition();
        fruitsPoly.popularBrands();
        System.out.println("----------------------");

        FruitsDetails fruitsDetails = new FruitsDetails();
        fruitsDetails.totalVarieties();
        fruitsDetails.commonFruits();
        fruitsDetails.bestSeason();
        fruitsDetails.nutrition();
        fruitsDetails.popularBrands();
        fruitsDetails.extraMethod();
        System.out.println("----------------------");

        FruitsCast fruitsCast = new FruitsCast();
        fruitsCast.cast(fruitsPoly);
    }
}
