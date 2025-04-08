package casting;

public class WaterDetails extends Water {
    @Override
    public void necessity() {
        System.out.println("Overridden: necessity in WaterDetails");
    }

    @Override
    public void sources() {
        System.out.println("Overridden: sources in WaterDetails");
    }

    @Override
    public void states() {
        System.out.println("Overridden: states in WaterDetails");
    }

    @Override
    public void purification() {
        System.out.println("Overridden: purification in WaterDetails");
    }

    @Override
    public void usage() {
        System.out.println("Overridden: usage in WaterDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in WaterDetails");
    }
}
