package objectmethods;

public class Bottle {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 104;
    }
}
