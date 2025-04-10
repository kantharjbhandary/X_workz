package objectmethods;

public class Duster {

    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 182;
    }
}
