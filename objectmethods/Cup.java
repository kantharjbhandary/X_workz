package objectmethods;

public class Cup {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 118;
    }
}
