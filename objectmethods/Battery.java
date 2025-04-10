package objectmethods;

public class Battery {

    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 147;
    }
}
