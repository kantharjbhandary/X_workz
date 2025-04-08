package casting;

public class TypeOfCarRunner {
    public static void main(String[] args) {

        TypeOfCar typeOfCar = new TypeOfCar();
        typeOfCar.categories();
        typeOfCar.fuelType();
        typeOfCar.speed();
        typeOfCar.brands();
        typeOfCar.seatingCapacity();
        System.out.println("----------------------");

        TypeOfCar typeOfCarPoly = new TypeOfCarDetails();
        typeOfCarPoly.categories();
        typeOfCarPoly.fuelType();
        typeOfCarPoly.speed();
        typeOfCarPoly.brands();
        typeOfCarPoly.seatingCapacity();
        System.out.println("----------------------");

        TypeOfCarDetails typeOfCarDetails = new TypeOfCarDetails();
        typeOfCarDetails.categories();
        typeOfCarDetails.fuelType();
        typeOfCarDetails.speed();
        typeOfCarDetails.brands();
        typeOfCarDetails.seatingCapacity();
        typeOfCarDetails.extraMethod();
        System.out.println("----------------------");

        TypeOfCarCast typeOfCarCast = new TypeOfCarCast();
        typeOfCarCast.cast(typeOfCarPoly);
    }
}
