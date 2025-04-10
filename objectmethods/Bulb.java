package objectmethods;

public class Bulb {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 150;
    }
}
