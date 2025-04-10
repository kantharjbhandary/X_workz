package objectmethods;

public class Cap {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 137;
    }
}
