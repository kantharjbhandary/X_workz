package casting;

public class TypeOfCarDetails extends TypeOfCar {
    @Override
    public void categories() {
        System.out.println("Overridden: categories in TypeOfCarDetails");
    }

    @Override
    public void fuelType() {
        System.out.println("Overridden: fuelType in TypeOfCarDetails");
    }

    @Override
    public void speed() {
        System.out.println("Overridden: speed in TypeOfCarDetails");
    }

    @Override
    public void brands() {
        System.out.println("Overridden: brands in TypeOfCarDetails");
    }

    @Override
    public void seatingCapacity() {
        System.out.println("Overridden: seatingCapacity in TypeOfCarDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in TypeOfCarDetails");
    }
}
