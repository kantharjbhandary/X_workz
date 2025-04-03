package parent.child.external;

import parent.child.internal.ElectricCar;
import parent.child.internal.TypeOfCar;

public class TypeOfCarRunner {

        public static void main(String[] args) {
            TypeOfCar typeOfCar = new TypeOfCar();
            typeOfCar.categories();
            typeOfCar.fuelType();
            typeOfCar.speed();
            typeOfCar.brands();
            typeOfCar.seatingCapacity();

            System.out.println("-------------------------");

            ElectricCar electricCar = new ElectricCar();
            electricCar.categories();
            electricCar.fuelType();
            electricCar.speed();
            electricCar.brands();
            electricCar.seatingCapacity();

            System.out.println("-------------------------");

            TypeOfCar typeOfCar1 = new ElectricCar();
            typeOfCar1.categories();
            typeOfCar1.fuelType();
            typeOfCar1.speed();
            typeOfCar1.brands();
            typeOfCar1.seatingCapacity();
        }
    }

