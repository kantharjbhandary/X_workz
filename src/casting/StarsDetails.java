package casting;

public class StarsDetails extends Stars {
    @Override
    public void brightness() {
        System.out.println("Overridden: brightness in StarsDetails");
    }

    @Override
    public void size() {
        System.out.println("Overridden: size in StarsDetails");
    }

    @Override
    public void composition() {
        System.out.println("Overridden: composition in StarsDetails");
    }

    @Override
    public void lifecycle() {
        System.out.println("Overridden: lifecycle in StarsDetails");
    }

    @Override
    public void constellations() {
        System.out.println("Overridden: constellations in StarsDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in StarsDetails");
    }
}
