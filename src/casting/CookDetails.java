package casting;

public class CookDetails extends Cook {
    @Override
    public void skills() {
        System.out.println("Overridden: skills in CookDetails");
    }

    @Override
    public void ingredients() {
        System.out.println("Overridden: ingredients in CookDetails");
    }

    @Override
    public void methods() {
        System.out.println("Overridden: methods in CookDetails");
    }

    @Override
    public void cuisine() {
        System.out.println("Overridden: cuisine in CookDetails");
    }

    @Override
    public void tools() {
        System.out.println("Overridden: tools in CookDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in CookDetails");
    }
}
