package parent.child.external;

import parent.child.internal.Agriculture;
import parent.child.internal.AnimalHusbandry;
import parent.child.internal.DairyFarming;

public class AnimalHusbandryRunner {

        public static void main(String[] args) {
            AnimalHusbandry animalHusbandry = new AnimalHusbandry();
            animalHusbandry.livestock();
            animalHusbandry.dairy();
            animalHusbandry.poultry();
            animalHusbandry.breeding();
            animalHusbandry.economy();

            System.out.println("-------------------------");

            DairyFarming dairyFarming = new DairyFarming();
            dairyFarming.livestock();
            dairyFarming.dairy();
            dairyFarming.poultry();
            dairyFarming.breeding();
            dairyFarming.economy();

            System.out.println("-------------------------");

            AnimalHusbandry animalHusbandry1 = new DairyFarming();
            animalHusbandry1.livestock();
            animalHusbandry1.dairy();
            animalHusbandry1.poultry();
            animalHusbandry1.breeding();
            animalHusbandry1.economy();
        }
    }


