package objectmethods;

public class Laptop {

    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 111;
    }
}
