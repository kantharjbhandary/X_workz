package casting;

public class WalmartDetails extends Walmart {
    @Override
    public void branches() {
        System.out.println("Overridden: branches in WalmartDetails");
    }

    @Override
    public void products() {
        System.out.println("Overridden: products in WalmartDetails");
    }

    @Override
    public void services() {
        System.out.println("Overridden: services in WalmartDetails");
    }

    @Override
    public void discounts() {
        System.out.println("Overridden: discounts in WalmartDetails");
    }

    @Override
    public void eCommerce() {
        System.out.println("Overridden: eCommerce in WalmartDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in WalmartDetails");
    }
}
