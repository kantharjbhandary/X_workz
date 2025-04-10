package objectmethods;

public class Tripod {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 146;
    }
}
