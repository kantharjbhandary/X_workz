package casting;

public class ValcanoDetails extends Valcano {
    @Override
    public void type() {
        System.out.println("Overridden: type in ValcanoDetails");
    }

    @Override
    public void eruption() {
        System.out.println("Overridden: eruption in ValcanoDetails");
    }

    @Override
    public void location() {
        System.out.println("Overridden: location in ValcanoDetails");
    }

    @Override
    public void impact() {
        System.out.println("Overridden: impact in ValcanoDetails");
    }

    @Override
    public void monitoring() {
        System.out.println("Overridden: monitoring in ValcanoDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in ValcanoDetails");
    }
}
