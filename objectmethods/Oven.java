package objectmethods;

public class Oven {

    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 170;
    }
}
