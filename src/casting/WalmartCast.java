package casting;

public class WalmartCast {
    public void cast(Walmart walmart) {
        System.out.println("Casting Walmart");
        walmart.branches();
        walmart.products();
        walmart.services();
        walmart.discounts();
        walmart.eCommerce();
        if(walmart instanceof WalmartDetails) {
            WalmartDetails ref = (WalmartDetails)walmart;
            ref.extraMethod();
        }
    }
}
