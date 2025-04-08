package parent.child.external;

import parent.child.internal.Chef;
import parent.child.internal.Cook;
import parent.child.utility.MasterChef;

public class CookRunner {

        public static void main(String[] args) {
            Cook cook = new Cook();
            cook.skills();
            cook.ingredients();
            cook.methods();
            cook.cuisine();
            cook.tools();

            System.out.println("-------------------------");

            Chef chef = new Chef();
            chef.skills();
            chef.ingredients();
            chef.methods();
            chef.cuisine();
            chef.tools();

            System.out.println("-------------------------");

            Cook cook1 = new Chef();
            cook1.skills();
            cook1.ingredients();
            cook1.methods();
            cook1.cuisine();
            cook1.tools();
            System.out.println("------");
            MasterChef masterChef=new MasterChef();
            masterChef.masterofMasterchef(cook);
            masterChef.masterofMasterchef(chef);
        }
    }


