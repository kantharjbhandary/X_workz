package casting;

public class BeverageCast {
    public void cast(Beverage beverage) {
        System.out.println("Casting Beverage");
        beverage.temperature();
        beverage.flavor();
        beverage.ingredients();
        beverage.packaging();
        beverage.brand();
        if(beverage instanceof BeverageDetails) {
            BeverageDetails ref = (BeverageDetails)beverage;
            ref.extraMethod();
        }
    }
}
