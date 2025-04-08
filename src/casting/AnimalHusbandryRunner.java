package casting;

public class AnimalHusbandryRunner {
    public static void main(String[] args) {

        AnimalHusbandry animalHusbandry = new AnimalHusbandry();
        animalHusbandry.livestock();
        animalHusbandry.dairy();
        animalHusbandry.poultry();
        animalHusbandry.breeding();
        animalHusbandry.economy();
        System.out.println("----------------------");

        AnimalHusbandry animalHusbandryPoly = new AnimalHusbandryDetails();
        animalHusbandryPoly.livestock();
        animalHusbandryPoly.dairy();
        animalHusbandryPoly.poultry();
        animalHusbandryPoly.breeding();
        animalHusbandryPoly.economy();
        System.out.println("----------------------");

        AnimalHusbandryDetails animalHusbandryDetails = new AnimalHusbandryDetails();
        animalHusbandryDetails.livestock();
        animalHusbandryDetails.dairy();
        animalHusbandryDetails.poultry();
        animalHusbandryDetails.breeding();
        animalHusbandryDetails.economy();
        animalHusbandryDetails.extraMethod();
        System.out.println("----------------------");

        AnimalHusbandryCast animalHusbandryCast = new AnimalHusbandryCast();
        animalHusbandryCast.cast(animalHusbandryPoly);
    }
}
