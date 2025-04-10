package objectmethods;

public class Biscuit {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 100;
    }
}
