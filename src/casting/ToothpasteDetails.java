package casting;

public class ToothpasteDetails extends Toothpaste {
    @Override
    public void ingredients() {
        System.out.println("Overridden: ingredients in ToothpasteDetails");
    }

    @Override
    public void flavor() {
        System.out.println("Overridden: flavor in ToothpasteDetails");
    }

    @Override
    public void brand() {
        System.out.println("Overridden: brand in ToothpasteDetails");
    }

    @Override
    public void benefits() {
        System.out.println("Overridden: benefits in ToothpasteDetails");
    }

    @Override
    public void usage() {
        System.out.println("Overridden: usage in ToothpasteDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in ToothpasteDetails");
    }
}
