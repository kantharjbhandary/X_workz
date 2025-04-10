package objectmethods;

public class Chalk {

    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 181;
    }
}
