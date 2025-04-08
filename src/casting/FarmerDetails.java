package casting;

public class FarmerDetails extends Farmer {
    @Override
    public void crops() {
        System.out.println("Overridden: crops in FarmerDetails");
    }

    @Override
    public void irrigation() {
        System.out.println("Overridden: irrigation in FarmerDetails");
    }

    @Override
    public void livestock() {
        System.out.println("Overridden: livestock in FarmerDetails");
    }

    @Override
    public void equipment() {
        System.out.println("Overridden: equipment in FarmerDetails");
    }

    @Override
    public void market() {
        System.out.println("Overridden: market in FarmerDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in FarmerDetails");
    }
}
