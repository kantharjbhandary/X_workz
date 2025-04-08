package casting;

public class GalaxyDetails extends Galaxy {
    @Override
    public void composition() {
        System.out.println("Overridden: composition in GalaxyDetails");
    }

    @Override
    public void types() {
        System.out.println("Overridden: types in GalaxyDetails");
    }

    @Override
    public void distance() {
        System.out.println("Overridden: distance in GalaxyDetails");
    }

    @Override
    public void discovery() {
        System.out.println("Overridden: discovery in GalaxyDetails");
    }

    @Override
    public void size() {
        System.out.println("Overridden: size in GalaxyDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in GalaxyDetails");
    }
}
