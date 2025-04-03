package parent.child.external;

import parent.child.internal.SportsBike;
import parent.child.internal.TypeOfBike;

public class TypeofBikeRunner {


        public static void main(String[] args) {
            TypeOfBike typeOfBike = new TypeOfBike();
            typeOfBike.categories();
            typeOfBike.fuelType();
            typeOfBike.speed();
            typeOfBike.terrain();
            typeOfBike.brands();

            System.out.println("-------------------------");

            SportsBike sportsBike = new SportsBike();
            sportsBike.categories();
            sportsBike.fuelType();
            sportsBike.speed();
            sportsBike.terrain();
            sportsBike.brands();

            System.out.println("-------------------------");

            TypeOfBike typeOfBike1 = new SportsBike();
            typeOfBike1.categories();
            typeOfBike1.fuelType();
            typeOfBike1.speed();
            typeOfBike1.terrain();
            typeOfBike1.brands();
        }
    }

