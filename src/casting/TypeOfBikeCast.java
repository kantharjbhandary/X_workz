package casting;

public class TypeOfBikeCast {
    public void cast(TypeOfBike typeOfBike) {
        System.out.println("Casting TypeOfBike");
        typeOfBike.categories();
        typeOfBike.fuelType();
        typeOfBike.speed();
        typeOfBike.terrain();
        typeOfBike.brands();
        if(typeOfBike instanceof TypeOfBikeDetails) {
            TypeOfBikeDetails ref = (TypeOfBikeDetails)typeOfBike;
            ref.extraMethod();
        }
    }
}
