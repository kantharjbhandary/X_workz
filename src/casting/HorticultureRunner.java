package casting;

public class HorticultureRunner {
    public static void main(String[] args) {

        Horticulture horticulture = new Horticulture();
        horticulture.fruits();
        horticulture.vegetables();
        horticulture.floriculture();
        horticulture.landscaping();
        horticulture.economy();
        System.out.println("----------------------");

        Horticulture horticulturePoly = new HorticultureDetails();
        horticulturePoly.fruits();
        horticulturePoly.vegetables();
        horticulturePoly.floriculture();
        horticulturePoly.landscaping();
        horticulturePoly.economy();
        System.out.println("----------------------");

        HorticultureDetails horticultureDetails = new HorticultureDetails();
        horticultureDetails.fruits();
        horticultureDetails.vegetables();
        horticultureDetails.floriculture();
        horticultureDetails.landscaping();
        horticultureDetails.economy();
        horticultureDetails.extraMethod();
        System.out.println("----------------------");

        HorticultureCast horticultureCast = new HorticultureCast();
        horticultureCast.cast(horticulturePoly);
    }
}
