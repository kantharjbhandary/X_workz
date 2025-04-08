package casting;

public class BiologyDetails extends Biology {
    @Override
    public void study() {
        System.out.println("Overridden: study in BiologyDetails");
    }

    @Override
    public void branches() {
        System.out.println("Overridden: branches in BiologyDetails");
    }

    @Override
    public void evolution() {
        System.out.println("Overridden: evolution in BiologyDetails");
    }

    @Override
    public void humanBody() {
        System.out.println("Overridden: humanBody in BiologyDetails");
    }

    @Override
    public void medicalImpact() {
        System.out.println("Overridden: medicalImpact in BiologyDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in BiologyDetails");
    }
}
