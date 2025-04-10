package objectmethods;

public class Stove {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 171;
    }
}
