package casting;

public class DevilDetails extends Devil {
    @Override
    public void evil() {
        System.out.println("Overridden: evil in DevilDetails");
    }

    @Override
    public void trickery() {
        System.out.println("Overridden: trickery in DevilDetails");
    }

    @Override
    public void darkness() {
        System.out.println("Overridden: darkness in DevilDetails");
    }

    @Override
    public void myths() {
        System.out.println("Overridden: myths in DevilDetails");
    }

    @Override
    public void fear() {
        System.out.println("Overridden: fear in DevilDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in DevilDetails");
    }
}
