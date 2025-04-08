package casting;

public class TypeOfBikeDetails extends TypeOfBike {
    @Override
    public void categories() {
        System.out.println("Overridden: categories in TypeOfBikeDetails");
    }

    @Override
    public void fuelType() {
        System.out.println("Overridden: fuelType in TypeOfBikeDetails");
    }

    @Override
    public void speed() {
        System.out.println("Overridden: speed in TypeOfBikeDetails");
    }

    @Override
    public void terrain() {
        System.out.println("Overridden: terrain in TypeOfBikeDetails");
    }

    @Override
    public void brands() {
        System.out.println("Overridden: brands in TypeOfBikeDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in TypeOfBikeDetails");
    }
}
