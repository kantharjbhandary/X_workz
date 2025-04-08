package casting;

public class FestivalRunner {
    public static void main(String[] args) {

        Festival festival = new Festival();
        festival.name();
        festival.culture();
        festival.celebrationType();
        festival.publicHoliday();
        festival.foodSpecialties();
        System.out.println("----------------------");

        Festival festivalPoly = new FestivalDetails();
        festivalPoly.name();
        festivalPoly.culture();
        festivalPoly.celebrationType();
        festivalPoly.publicHoliday();
        festivalPoly.foodSpecialties();
        System.out.println("----------------------");

        FestivalDetails festivalDetails = new FestivalDetails();
        festivalDetails.name();
        festivalDetails.culture();
        festivalDetails.celebrationType();
        festivalDetails.publicHoliday();
        festivalDetails.foodSpecialties();
        festivalDetails.extraMethod();
        System.out.println("----------------------");

        FestivalCast festivalCast = new FestivalCast();
        festivalCast.cast(festivalPoly);
    }
}
