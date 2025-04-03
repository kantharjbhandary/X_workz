package parent.child.external;

import parent.child.internal.Beverage;
import parent.child.internal.Juice;

public class BeverageRunner {

        public static void main(String[] args) {
            Beverage beverage = new Beverage();
            beverage.temperature();
            beverage.flavor();
            beverage.ingredients();
            beverage.packaging();
            beverage.brand();

            System.out.println("-------------------------");

            Juice juice = new Juice();
            juice.temperature();
            juice.flavor();
            juice.ingredients();
            juice.packaging();
            juice.brand();

            System.out.println("-------------------------");

            Beverage beverage1 = new Juice();
            beverage1.temperature();
            beverage1.flavor();
            beverage1.ingredients();
            beverage1.packaging();
            beverage1.brand();
        }
    }

