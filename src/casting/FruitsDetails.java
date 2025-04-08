package casting;

public class FruitsDetails extends Fruits {
    @Override
    public void totalVarieties() {
        System.out.println("Overridden: totalVarieties in FruitsDetails");
    }

    @Override
    public void commonFruits() {
        System.out.println("Overridden: commonFruits in FruitsDetails");
    }

    @Override
    public void bestSeason() {
        System.out.println("Overridden: bestSeason in FruitsDetails");
    }

    @Override
    public void nutrition() {
        System.out.println("Overridden: nutrition in FruitsDetails");
    }

    @Override
    public void popularBrands() {
        System.out.println("Overridden: popularBrands in FruitsDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in FruitsDetails");
    }
}
