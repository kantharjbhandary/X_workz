package casting;

public class BarberDetails extends Barber {
    @Override
    public void haircut() {
        System.out.println("Overridden: haircut in BarberDetails");
    }

    @Override
    public void shaving() {
        System.out.println("Overridden: shaving in BarberDetails");
    }

    @Override
    public void styling() {
        System.out.println("Overridden: styling in BarberDetails");
    }

    @Override
    public void products() {
        System.out.println("Overridden: products in BarberDetails");
    }

    @Override
    public void tools() {
        System.out.println("Overridden: tools in BarberDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in BarberDetails");
    }
}
