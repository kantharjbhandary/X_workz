package casting;

public class HorticultureDetails extends Horticulture {
    @Override
    public void fruits() {
        System.out.println("Overridden: fruits in HorticultureDetails");
    }

    @Override
    public void vegetables() {
        System.out.println("Overridden: vegetables in HorticultureDetails");
    }

    @Override
    public void floriculture() {
        System.out.println("Overridden: floriculture in HorticultureDetails");
    }

    @Override
    public void landscaping() {
        System.out.println("Overridden: landscaping in HorticultureDetails");
    }

    @Override
    public void economy() {
        System.out.println("Overridden: economy in HorticultureDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in HorticultureDetails");
    }
}
