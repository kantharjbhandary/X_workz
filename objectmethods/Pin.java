package objectmethods;

public class Pin {

    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 184;
    }
}
