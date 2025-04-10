package objectmethods;

public class Knife {

    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 122;
    }
}
