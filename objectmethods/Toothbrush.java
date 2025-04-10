package objectmethods;

public class Toothbrush {

    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 158;
    }
}
