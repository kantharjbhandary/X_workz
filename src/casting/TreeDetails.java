package casting;

public class TreeDetails extends Tree {
    @Override
    public void type() {
        System.out.println("Overridden: type in TreeDetails");
    }

    @Override
    public void height() {
        System.out.println("Overridden: height in TreeDetails");
    }

    @Override
    public void leaves() {
        System.out.println("Overridden: leaves in TreeDetails");
    }

    @Override
    public void lifespan() {
        System.out.println("Overridden: lifespan in TreeDetails");
    }

    @Override
    public void uses() {
        System.out.println("Overridden: uses in TreeDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in TreeDetails");
    }
}
