package parent.child.external;

import parent.child.internal.Walmart;
import parent.child.internal.WalmartStore;

public class WalmartRunner {

        public static void main(String[] args) {
            Walmart walmart = new Walmart();
            walmart.branches();
            walmart.products();
            walmart.services();
            walmart.discounts();
            walmart.eCommerce();

            System.out.println("-------------------------");

            WalmartStore walmartStore = new WalmartStore();
            walmartStore.branches();
            walmartStore.products();
            walmartStore.services();
            walmartStore.discounts();
            walmartStore.eCommerce();

            System.out.println("-------------------------");

            Walmart walmart1 = new WalmartStore();
            walmart1.branches();
            walmart1.products();
            walmart1.services();
            walmart1.discounts();
            walmart1.eCommerce();
        }

}
