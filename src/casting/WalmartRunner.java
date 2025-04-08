package casting;

public class WalmartRunner {
    public static void main(String[] args) {

        Walmart walmart = new Walmart();
        walmart.branches();
        walmart.products();
        walmart.services();
        walmart.discounts();
        walmart.eCommerce();
        System.out.println("----------------------");

        Walmart walmartPoly = new WalmartDetails();
        walmartPoly.branches();
        walmartPoly.products();
        walmartPoly.services();
        walmartPoly.discounts();
        walmartPoly.eCommerce();
        System.out.println("----------------------");

        WalmartDetails walmartDetails = new WalmartDetails();
        walmartDetails.branches();
        walmartDetails.products();
        walmartDetails.services();
        walmartDetails.discounts();
        walmartDetails.eCommerce();
        walmartDetails.extraMethod();
        System.out.println("----------------------");

        WalmartCast walmartCast = new WalmartCast();
        walmartCast.cast(walmartPoly);
    }
}
