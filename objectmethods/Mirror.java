package objectmethods;

public class Mirror {

    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 123;
    }
}
