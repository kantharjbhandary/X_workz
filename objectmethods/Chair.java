package objectmethods;

public class Chair {

    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 105;
    }
}
