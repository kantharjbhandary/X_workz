package casting;

public class BeverageRunner {
    public static void main(String[] args) {

        Beverage beverage = new Beverage();
        beverage.temperature();
        beverage.flavor();
        beverage.ingredients();
        beverage.packaging();
        beverage.brand();
        System.out.println("----------------------");

        Beverage beveragePoly = new BeverageDetails();
        beveragePoly.temperature();
        beveragePoly.flavor();
        beveragePoly.ingredients();
        beveragePoly.packaging();
        beveragePoly.brand();
        System.out.println("----------------------");

        BeverageDetails beverageDetails = new BeverageDetails();
        beverageDetails.temperature();
        beverageDetails.flavor();
        beverageDetails.ingredients();
        beverageDetails.packaging();
        beverageDetails.brand();
        beverageDetails.extraMethod();
        System.out.println("----------------------");

        BeverageCast beverageCast = new BeverageCast();
        beverageCast.cast(beveragePoly);
    }
}
