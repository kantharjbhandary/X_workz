package objectmethods;

public class Drill {

    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 192;
    }
}
