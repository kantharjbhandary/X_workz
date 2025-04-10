package objectmethods;

public class Eraser {

    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 107;
    }
}
