package objectmethods;

public class Charger {

    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 112;
    }
}
