package objectmethods;

public class Stapler {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 183;
    }
}
