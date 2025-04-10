package objectmethods;

public class Frame {

    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 143;
    }
}
