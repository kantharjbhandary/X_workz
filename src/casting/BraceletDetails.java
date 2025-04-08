package casting;

public class BraceletDetails extends Bracelet {
    @Override
    public void material() {
        System.out.println("Overridden: material in BraceletDetails");
    }

    @Override
    public void design() {
        System.out.println("Overridden: design in BraceletDetails");
    }

    @Override
    public void usage() {
        System.out.println("Overridden: usage in BraceletDetails");
    }

    @Override
    public void history() {
        System.out.println("Overridden: history in BraceletDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in BraceletDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in BraceletDetails");
    }
}
