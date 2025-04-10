package objectmethods;

public class Screwdriver {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 194;
    }
}
