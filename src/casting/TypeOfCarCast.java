package casting;

public class TypeOfCarCast {
    public void cast(TypeOfCar typeOfCar) {
        System.out.println("Casting TypeOfCar");
        typeOfCar.categories();
        typeOfCar.fuelType();
        typeOfCar.speed();
        typeOfCar.brands();
        typeOfCar.seatingCapacity();
        if(typeOfCar instanceof TypeOfCarDetails) {
            TypeOfCarDetails ref = (TypeOfCarDetails)typeOfCar;
            ref.extraMethod();
        }
    }
}
