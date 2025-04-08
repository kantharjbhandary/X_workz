package casting;

public class AnimalHusbandryCast {
    public void cast(AnimalHusbandry animalHusbandry) {
        System.out.println("Casting AnimalHusbandry");
        animalHusbandry.livestock();
        animalHusbandry.dairy();
        animalHusbandry.poultry();
        animalHusbandry.breeding();
        animalHusbandry.economy();
        if(animalHusbandry instanceof AnimalHusbandryDetails) {
            AnimalHusbandryDetails ref = (AnimalHusbandryDetails)animalHusbandry;
            ref.extraMethod();
        }
    }
}
