package parent.child.external;

import parent.child.internal.Backpack;
import parent.child.internal.Bag;

public class BagRunner {

        public static void main(String[] args) {
            Bag bag = new Bag();
            bag.carryItems();
            bag.materialType();
            bag.size();
            bag.durability();
            bag.compartments();

            System.out.println("-------------------------");

            Backpack backpack = new Backpack();
            backpack.carryItems();
            backpack.materialType();
            backpack.size();
            backpack.durability();
            backpack.compartments();

            System.out.println("-------------------------");

            Bag bag1 = new Backpack();
            bag1.carryItems();
            bag1.materialType();
            bag1.size();
            bag1.durability();
            bag1.compartments();
        }
    }

