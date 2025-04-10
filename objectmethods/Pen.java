package objectmethods;

public class Pen {

    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 102;
    }
}
