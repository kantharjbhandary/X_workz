package casting;

public class TypeOfBikeRunner {
    public static void main(String[] args) {

        TypeOfBike typeOfBike = new TypeOfBike();
        typeOfBike.categories();
        typeOfBike.fuelType();
        typeOfBike.speed();
        typeOfBike.terrain();
        typeOfBike.brands();
        System.out.println("----------------------");

        TypeOfBike typeOfBikePoly = new TypeOfBikeDetails();
        typeOfBikePoly.categories();
        typeOfBikePoly.fuelType();
        typeOfBikePoly.speed();
        typeOfBikePoly.terrain();
        typeOfBikePoly.brands();
        System.out.println("----------------------");

        TypeOfBikeDetails typeOfBikeDetails = new TypeOfBikeDetails();
        typeOfBikeDetails.categories();
        typeOfBikeDetails.fuelType();
        typeOfBikeDetails.speed();
        typeOfBikeDetails.terrain();
        typeOfBikeDetails.brands();
        typeOfBikeDetails.extraMethod();
        System.out.println("----------------------");

        TypeOfBikeCast typeOfBikeCast = new TypeOfBikeCast();
        typeOfBikeCast.cast(typeOfBikePoly);
    }
}
