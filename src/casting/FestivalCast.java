package casting;

public class FestivalCast {
    public void cast(Festival festival) {
        System.out.println("Casting Festival");
        festival.name();
        festival.culture();
        festival.celebrationType();
        festival.publicHoliday();
        festival.foodSpecialties();
        if(festival instanceof FestivalDetails) {
            FestivalDetails ref = (FestivalDetails)festival;
            ref.extraMethod();
        }
    }
}
