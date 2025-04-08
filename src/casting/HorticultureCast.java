package casting;

public class HorticultureCast {
    public void cast(Horticulture horticulture) {
        System.out.println("Casting Horticulture");
        horticulture.fruits();
        horticulture.vegetables();
        horticulture.floriculture();
        horticulture.landscaping();
        horticulture.economy();
        if(horticulture instanceof HorticultureDetails) {
            HorticultureDetails ref = (HorticultureDetails)horticulture;
            ref.extraMethod();
        }
    }
}
